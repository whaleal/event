package com.whaleal.event;

import java.util.Collection;
import java.util.Map;

/**
 * BatchEvent
 * 一批数据
 *
 * @author wh
 */
public class BatchEvent< E > extends AbstractBatchEvent< Collection< E >, E > {


    public BatchEvent() {
        super();
    }

    public BatchEvent( Map< String, Object > headers ) {
        super(headers);
    }

}
