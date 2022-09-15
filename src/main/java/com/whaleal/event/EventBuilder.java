package com.whaleal.event;


import java.util.Map;

/**
 * EventBuilder
 *
 * @author wh
 */
public class EventBuilder< T > {


    private T body;
    private Map< String, Object > headers;

    /**
     * Instantiate an Event instance based on the provided body and headers.
     * If <code>headers</code> is <code>null</code>, then it is ignored.
     *
     * @param body
     * @param headers
     * @return
     */
    public EventBuilder< T > withBody( T body, Map< String, Object > headers ) {
        this.body = body;
        this.headers = headers;
        return this;
    }

    public EventBuilder< T > withBody( T body ) {
        this.body = body;
        return this;
    }

    public EventBuilder< T > withHeader( Map< String, Object > headers ) {
        this.headers = headers;
        return this;
    }


    public Event< T > build() {
        Event< T > event = new SimpleEvent< T >();

        event.setBody(this.body);

        if (this.headers != null) {
            event.setHeaders(headers);
        }

        return event;

    }


}
