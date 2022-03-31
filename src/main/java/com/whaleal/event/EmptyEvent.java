package com.whaleal.event;

import java.util.Map;

/**
 * an Empty Event .Used for sending  message
 * <p>
 * 空消息 ，表示结束
 * 消息 体 为空
 * 但是可以设置 header
 *
 * @author wh
 */
public class EmptyEvent extends AbstractEvent< Void > {

    private EmptyEvent() {
        super();
    }

    private EmptyEvent( Map< String, Object > headers ) {
        super(headers);
    }

    public static EmptyEvent create() {
        return new EmptyEvent();
    }

    public static EmptyEvent create( Map< String, Object > headers ) {
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
