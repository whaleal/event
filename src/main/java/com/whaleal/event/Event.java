/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.whaleal.event;

import java.util.Map;

/**
 * Basic representation of a data object in Event.
 * Provides access to data as it flows through the system.
 *
 * @author wh
 */
public interface Event< T > {

    /**
     * Returns a map of name-value pairs describing the data stored in the body.
     */
    Map< String, Object > getHeaders();

    /**
     * Set the event headers
     *
     * @param headers Map of headers to replace the current headers.
     */
    void setHeaders( Map< String, Object > headers );

    /**
     * Returns the raw byte array of the data contained in this event.
     */
    T getBody();

    /**
     * Sets the raw byte array of the data contained in this event.
     *
     * @param body The data.
     */
    void setBody( T body );

}