/*
 * ========================================================================
 *
 * Codehaus Cargo, copyright 2004-2011 Vincent Massol, 2012-2024 Ali Tokmen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package org.codehaus.cargo.sample.maven3.tomcat10x_legacyWar_test;

import java.net.URL;

import junit.framework.TestCase;

import org.codehaus.cargo.sample.java.PingUtils;
import org.codehaus.cargo.util.log.Logger;
import org.codehaus.cargo.util.log.SimpleLogger;

/**
 * Test legacy WAR deployed on Tomcat 10.x.
 */
public class Tomcat10xLegacyWarTest extends TestCase
{

    /**
     * Logger.
     */
    private Logger logger = new SimpleLogger();

    /**
     * Test legacy WAR deployed on Tomcat 10.x.
     * @throws Exception If anything fails.
     */
    public void testTomcat10xLegacyWar() throws Exception
    {
        final URL url = new URL("http://localhost:" + System.getProperty("http.port")
            + "/systemproperty-test/test?systemPropertyName=testProperty");
        final String expected = "testValue";

        PingUtils.assertPingTrue("System property testProperty not found on " + url.getPath(),
            expected, url, logger);
    }

}
