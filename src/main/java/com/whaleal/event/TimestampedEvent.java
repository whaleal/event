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


import com.whaleal.event.util.StrUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * {@link Event} implementation that has a timestamp.
 * The timestamp is taken from (in order of precedence):<ol>
 * <li>The "timestamp" header of the base event, if present</li>
 * <li>The "@timestamp" header of the base event, if present</li>
 * <li>The current time in millis, otherwise</li>
 * </ol>
 *
 * @author wh
 */
public class TimestampedEvent< T > extends AbstractEvent< T > {

    private final long timestamp;

    TimestampedEvent( Event< T > base ) {
        setBody(base.getBody());
        Map< String, Object > headers = new HashMap<>(base.getHeaders());
        String timestampString = (String) headers.get("timestamp");
        if (StrUtil.isBlank(timestampString)) {
            timestampString = (String) headers.get("@timestamp");
        }
        if (StrUtil.isBlank(timestampString)) {
            this.timestamp = System.currentTimeMillis();
            headers.put("timestamp", String.valueOf(timestamp));
        } else {
            this.timestamp = Long.valueOf(timestampString);
        }
        setHeaders(headers);
    }

    long getTimestamp() {
        return this.timestamp;
    }


}
