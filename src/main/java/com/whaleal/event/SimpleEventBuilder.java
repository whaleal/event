package com.whaleal.event;


import java.util.Map;

/**
 * EventBuilder
 *
 * @author wh
 */
public class SimpleEventBuilder< T > {


    private T body;
    private Map< String, ? > headers;

    /**
     * Instantiate an Event instance based on the provided body and headers.
     * If <code>headers</code> is <code>null</code>, then it is ignored.
     *
     * @param body
     * @param headers
     * @return
     */
    public SimpleEventBuilder< T > withBody( T body, Map< String, ? > headers ) {
        this.body = body;
        this.headers = headers;
        return this;
    }

    public SimpleEventBuilder< T > withBody( T body ) {
        this.body = body;
        return this;
    }

    public SimpleEventBuilder< T > withHeader( Map< String, ? > headers ) {
        this.headers = headers;
        return this;
    }


    public SimpleEvent< T > build() {
        SimpleEvent< T > event = new SimpleEvent< T >();

        event.setBody(this.body);


        event.setHeaders(headers);

        return event;

    }


}
