package com.whaleal.event;

import java.util.Map;

/**
 * 抽象的 Event
 *
 * @author wh
 */
public abstract class AbstractEvent< T > implements Event< T > {
    private static final long serialVersionUID = 2022075349620653480L;

    private Map< String, Object > headers;
    private T body;

    protected AbstractEvent() {
    }

    protected AbstractEvent( Map< String, Object > headers ) {
        if (headers != null) {
            this.headers = headers;
        }
    }

    @Override
    public Map< String, Object > getHeaders() {
        return this.headers;
    }

    @Override
    public void setHeaders( Map< String, Object > headers ) {
        if (headers != null) {
            this.headers = headers;
        }
    }

    @Override
    public T getBody() {
        return this.body;
    }

    @Override
    public void setBody( T body ) {
        if (body == null)
            throw new IllegalArgumentException("null body");

        this.body = body;


    }


    @Override
    public String toString() {
        return "[Event headers = " + headers + ", body = " + body + " ]";
    }
}
