package com.whaleal.event;

import java.util.Collection;
import java.util.Map;

/**
 * @author wh
 *
 *  add a bathEvent with timestamp
 * 增加了批时间事件流
 */
public class TimeStampedBatchEvent< E > extends AbstractBatchEvent< Collection< E >, E > {

    public TimeStampedBatchEvent() {
        super();
        this.timestamp = System.currentTimeMillis();
    }

    public TimeStampedBatchEvent( Map< String, ? > headers ) {
        super(headers);
        this.timestamp = System.currentTimeMillis();
    }


    /**
     * System  create time
     * 比选后选择 System.currentTimeMillis(); 来生成该值;
     */
    private final long timestamp;


    /**
     * Customer defined time
     */
    private long watermark;



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
