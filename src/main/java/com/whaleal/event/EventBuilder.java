package com.whaleal.event;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * EventBuilder
 *
 * @author wh
 */
public class EventBuilder {

    /**
     * Instantiate an Event instance based on the provided body and headers.
     * If <code>headers</code> is <code>null</code>, then it is ignored.
     *
     * @param body
     * @param headers
     * @return
     */
    public static Event< String > withBody( String body, Map< String, String > headers ) {
        Event event = new SimpleEvent();

        event.setBody(body);

        if (headers != null) {
            event.setHeaders(new HashMap< String, String >(headers));
        }

        return event;
    }

    public static Event< String > withBody( String body ) {
        return withBody(body, (Map) null);
    }

    public static Event< String > withBody( String body, Charset charset,
                                            Map< String, String > headers ) {

        if (body != null) {
            body = new String(body.getBytes(charset));
        }

        return withBody(body, headers);
    }

    public static Event withBody( String body, Charset charset ) {
        return withBody(body, charset, null);
    }

}
