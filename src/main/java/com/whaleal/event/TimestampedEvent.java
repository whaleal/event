package com.whaleal.event;


import java.util.Map;

/**
 * {@link Event} implementation that has a timestamp.
 * The timestamp is taken from (in order of precedence):<ol>
 *
 * <li>The current time in millis, otherwise</li>
 * </ol>
 *
 * @author wh
 */
public abstract class TimestampedEvent< T > extends AbstractEvent< T > {


    /**
     * System  create time
     */
    private final long timestamp;


    /**
     * Customer defined time
     */
    private long watermark;

    protected TimestampedEvent() {
        super();
        this.timestamp = System.currentTimeMillis();
    }

    protected TimestampedEvent( Map< String, Object > headers ) {
        super(headers);
        this.timestamp = System.currentTimeMillis();
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public long getWatermark() {
        return watermark;
    }

    public void setWatermark( long watermark ) {
        this.watermark = watermark;
    }


}
