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
package org.codehaus.cargo.container.wildfly;

/**
 * WildFly 15.x existing {@link org.codehaus.cargo.container.configuration.Configuration}
 * implementation.
 */
public class WildFly15xExistingLocalConfiguration extends WildFly14xExistingLocalConfiguration
{
    /**
     * {@inheritDoc}
     * @see WildFly14xExistingLocalConfiguration#WildFly14xExistingLocalConfiguration(String)
     */
    public WildFly15xExistingLocalConfiguration(String dir)
    {
        super(dir);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        return "WildFly 15.x Existing Configuration";
    }
}
