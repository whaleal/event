package com.whaleal.event;

import java.util.Collection;
import java.util.Map;

/**
 * @author wh
 */
public abstract class AbstractBatchEvent< T extends Collection< E >, E > extends AbstractEvent< T > {

    protected AbstractBatchEvent() {
        super();
    }

    protected AbstractBatchEvent( Map< String, Object > headers ) {
        super(headers);
    }

    public int size() {
        if (super.getBody() != null) {
            return super.getBody().size();
        } else {
            return 0;
        }
    }
}
