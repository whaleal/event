package com.whaleal.event;

import java.util.Map;

/**
 * 抽象的 Event
 * @author wh
 *
 */
public abstract class AbstractEvent< T > implements Event< T > {

    private Map< String, Object > headers;
    private T body;

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
        if(body!=null){
            this.body = body;
        }

    }


    @Override
    public String toString() {
        return "[Event headers = " + headers + ", body = " + body + " ]";
    }
}
