package com.whaleal.event;

/**
 * An event delivery exception is raised whenever an {@link Event} fails to
 * reach at least one of its intended (next-hop) destinations.
 *
 * @author wh
 */
public class EventException extends Exception {

    private static final long serialVersionUID = 1102327497549834945L;

    public EventException() {
        super();
    }

    public EventException( String message ) {
        super(message);
    }

    public EventException( String message, Throwable t ) {
        super(message, t);
    }

    public EventException( Throwable t ) {
        super(t);
    }

}
