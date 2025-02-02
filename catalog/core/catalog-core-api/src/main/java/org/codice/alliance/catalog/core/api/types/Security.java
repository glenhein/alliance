/**
 * Copyright (c) Codice Foundation
 * <p>
 * This is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details. A copy of the GNU Lesser General Public License
 * is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */
package org.codice.alliance.catalog.core.api.types;

/**
 * <p>
 * <b> This code is experimental. While this interface is functional and tested, it may change or be
 * removed in a future version of the library. </b>
 * </p>
 */
public interface Security {

    /**
     * Attribute name for accessing the security classification for this Metacard. <br/>
     */
    String CLASSIFICATION = "security.classification";

    /**
     * Attribute name for accessing the security classification system for this Metacard. <br/>
     */
    String CLASSIFICATION_SYSTEM = "security.classification-system";

    /**
     * Attribute name for accessing the security code words for this Metacard. <br/>
     */
    String CODEWORDS = "security.codewords";

    /**
     * Attribute name for accessing the security dissemination controls for this Metacard. <br/>
     */
    String DISSEMINATION_CONTROLS = "security.dissemination-controls";

    /**
     * Attribute name for accessing other security dissemination controls for this Metacard. <br/>
     */
    String OTHER_DISSEMINATION_CONTROLS = "security.other-dissemination-controls";

    /**
     * Attribute name for accessing the country codes of owners and producers for this Metacard. <br/>
     */
    String OWNER_PRODUCER = "security.owner-producer";

    /**
     * Attribute name for accessing the releasability for this Metacard. <br/>
     */
    String RELEASABILITY = "security.releasability";
}
