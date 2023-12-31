/*
 * ========================================================================
 *
 * Copyright 2003 The Apache Software Foundation. Code from this file
 * was originally imported from the Jakarta Cactus project.
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
package org.codehaus.cargo.module.ejb.websphere;

import org.codehaus.cargo.module.AbstractDescriptorType;

/**
 */
public class IbmEjbJarBndXmiType extends AbstractDescriptorType
{
    /**
     * Static instance.
     */
    private static IbmEjbJarBndXmiType instance = new IbmEjbJarBndXmiType();

    /**
     * Protected constructor.
     */
    protected IbmEjbJarBndXmiType()
    {
        super(null, IbmEjbJarBndXmi.class, new IbmEjbJarBndXmiGrammar());
    }

    /**
     * Get the static instance.
     * @return The instance
     */
    public static IbmEjbJarBndXmiType getInstance()
    {
        return instance;
    }
}
