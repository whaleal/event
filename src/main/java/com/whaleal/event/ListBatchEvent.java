package com.whaleal.event;

import java.util.List;
import java.util.Map;

/**
 * @author wh
 */
public class ListBatchEvent< E > extends AbstractBatchEvent< List< E >, E > {


    public ListBatchEvent() {
        super();
    }

    public ListBatchEvent( Map< String, Object > headers ) {
        super(headers);
    }

}
