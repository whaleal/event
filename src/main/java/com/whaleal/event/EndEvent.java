package com.whaleal.event;

/**
 * an Empty Event .Used for sending  message
 *
 * 空消息 ，表示结束
 *
 * @author wh
 *
 */
public class EndEvent extends AbstractEvent<Void>{
    private  static EndEvent endEvent = new EndEvent();
    private EndEvent(){
        super();
    }

    public static EndEvent create(){
        return endEvent;
    }
}
