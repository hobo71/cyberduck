package ch.cyberduck.core;

/*
 * Copyright (c) 2002-2013 David Kocher. All rights reserved.
 * http://cyberduck.ch/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to feedback@cyberduck.ch
 */

/**
 * @version $Id$
 */
public final class HostCredentials extends Credentials {

    private Host host;

    public HostCredentials(final Host host) {
        super(Preferences.instance().getProperty("connection.login.name"), null);
        this.host = host;
    }

    public HostCredentials(final Host host, final String user, final String password) {
        super(user, password);
        this.host = host;
    }

    public HostCredentials(final Host host, final String user, final String password, final boolean save) {
        super(user, password, save);
        this.host = host;
    }

    @Override
    public String getUsernamePlaceholder() {
        return host.getProtocol().getUsernamePlaceholder();
    }

    @Override
    public String getPasswordPlaceholder() {
        if(this.isPublicKeyAuthentication()) {
            return LocaleFactory.localizedString("Private Key Passphrase", "Credentials");
        }
        return host.getProtocol().getPasswordPlaceholder();
    }
}
