package ch.cyberduck.ui.cocoa;

/*
 *  Copyright (c) 2007 David Kocher. All rights reserved.
 *  http://cyberduck.ch/
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  Bug fixes, suggestions and comments should be sent to:
 *  dkocher@cyberduck.ch
 */

import ch.cyberduck.core.Filter;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.formatter.SizeFormatterFactory;
import ch.cyberduck.core.transfer.Transfer;
import ch.cyberduck.ui.cocoa.application.NSImage;
import ch.cyberduck.ui.cocoa.foundation.NSAttributedString;
import ch.cyberduck.ui.cocoa.foundation.NSObject;
import ch.cyberduck.ui.resources.IconCacheFactory;

/**
 * @version $Id$
 */
public class UploadPromptModel extends TransferPromptModel {

    public UploadPromptModel(TransferPromptController c, Transfer transfer) {
        super(c, transfer);
    }

    /**
     * Filtering what files are displayed. Used to decide which files to include in the prompt dialog
     */
    private Filter<Path> filter = new PromptFilter() {
        @Override
        public boolean accept(final Path file) {
            if(transfer.cache().lookup(file.getReference()) != null) {
                return true;
            }
            return false;
        }
    };

    @Override
    protected Filter<Path> filter() {
        return filter;
    }

    @Override
    protected NSObject objectValueForItem(final Path item, final String identifier) {
        final NSObject cached = tableViewCache.get(item, identifier);
        if(null == cached) {
            if(identifier.equals(TransferPromptModel.WARNING_COLUMN)) {
                if(item.attributes().isFile()) {
                    if(item.getLocal().attributes().getSize() == 0) {
                        return tableViewCache.put(item, identifier, IconCacheFactory.<NSImage>get().iconNamed("alert.tiff"));
                    }
                    if(item.attributes().getSize() > item.getLocal().attributes().getSize()) {
                        return tableViewCache.put(item, identifier, IconCacheFactory.<NSImage>get().iconNamed("alert.tiff"));
                    }
                }
                return null;
            }
            if(identifier.equals(TransferPromptModel.SIZE_COLUMN)) {
                return tableViewCache.put(item, identifier, NSAttributedString.attributedStringWithAttributes(
                        SizeFormatterFactory.get().format(item.attributes().getSize()),
                        TableCellAttributes.browserFontRightAlignment()));
            }
            return super.objectValueForItem(item, identifier);
        }
        return cached;
    }
}