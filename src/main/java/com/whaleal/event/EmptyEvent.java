package com.whaleal.event;

import java.util.Map;

/**
 * an Empty Event .Used for sending  message
 * <p>
 * Empty message , indicating the end
 * message body is empty
 * But headers can be set
 *
 * @author wh
 */
public class EmptyEvent extends AbstractEvent< Void > {

    private EmptyEvent() {
        super();
    }

    private EmptyEvent( Map< String, ? > headers ) {
        super(headers);
    }

    public static EmptyEvent create() {
        return new EmptyEvent();
    }

    public static EmptyEvent create( Map< String, ? > headers ) {
        return new EmptyEvent(headers);
    }

    @Override
    public Void getBody() {
        return null;
    }

    @Override
    public void setBody( Void body ) {
    }
}
