package ch.cyberduck.core.exception;

/*
 * Copyright (c) 2013 David Kocher. All rights reserved.
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
 * Bug fixes, suggestions and comments should be sent to:
 * dkocher@cyberduck.ch
 */

import ch.cyberduck.core.AbstractPath;
import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.Host;
import ch.cyberduck.core.Protocol;
import ch.cyberduck.core.sftp.SFTPPath;
import ch.cyberduck.core.sftp.SFTPSession;
import ch.cyberduck.core.threading.BackgroundException;

import org.junit.Test;

import javax.net.ssl.SSLHandshakeException;
import java.net.SocketException;
import java.security.cert.CertificateException;

import static org.junit.Assert.assertEquals;

/**
 * @version $Id$
 */
public class DefaultIOExceptionMappingServiceTest extends AbstractTestCase {

    @Test
    public void testMap() throws Exception {
        assertEquals(ConnectionCanceledException.class,
                new DefaultIOExceptionMappingService().map(new SocketException("Software caused connection abort")).getClass());
        assertEquals(ConnectionCanceledException.class,
                new DefaultIOExceptionMappingService().map(new SocketException("Socket closed")).getClass());
    }

    @Test
    public void testSSLHandshakeCertificateDismissed() {
        final SSLHandshakeException c = new SSLHandshakeException("f");
        c.initCause(new CertificateException("c"));
        assertEquals(ConnectionCanceledException.class,
                new DefaultIOExceptionMappingService().map(c).getClass());
    }

    @Test
    public void testplaceholder() throws Exception {
        final BackgroundException e = new DefaultIOExceptionMappingService().map("{0} message", new SocketException("s"),
                new SFTPPath(new SFTPSession(new Host(Protocol.SFTP, "localhost")), "/n", AbstractPath.VOLUME_TYPE));
        assertEquals("n message", e.getMessage());
    }
}