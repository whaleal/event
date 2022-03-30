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
