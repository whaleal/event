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
public class TimestampedEvent< T > extends AbstractEvent< T > {

    /**
     * System  create time
     * 比选后选择 System.currentTimeMillis(); 来生成该值;
     */
    private final long timestamp;


    /**
     * Customer defined time
     */
    private long watermark;

    public TimestampedEvent() {
        super();
        this.timestamp = System.currentTimeMillis();
    }

    public TimestampedEvent( Map< String, ? > headers ) {
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


    @Override
    public String toString() {
        return "[Event headers = " + super.getHeaders() + ", body = " + super.getBody() + ", timestamp = " + timestamp + ", watermark = " + watermark + " ]";
    }


}
