package com.whaleal.event;

import java.util.Map;

/**
 * Basic representation of a data object in Event.
 * Provides access to data as it flows through the system.
 *
 * @author wh
 */
public interface Event< T > {

    /**
     * Returns a map of name-value pairs describing the data stored in the body.
     */
    Map< String, Object > getHeaders();

    /**
     * Set the event headers
     *
     * @param headers Map of headers to replace the current headers.
     */
    void setHeaders( Map< String, Object > headers );

    /**
     * Returns the raw byte array of the data contained in this event.
     */
    T getBody();

    /**
     * Sets the raw byte array of the data contained in this event.
     *
     * @param body The data.
     */
    void setBody( T body );

}
