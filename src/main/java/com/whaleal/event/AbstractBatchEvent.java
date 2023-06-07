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

    protected AbstractBatchEvent( Map< String, ? > headers ) {
        super(headers);

    }

    public int size() {
        if (super.getBody() != null) {
            return super.getBody().size();
        } else {
            return 0;
        }
    }

    /**
     * @param element
     * @return
     * @throws EventException
     */
    public boolean add( E element ) throws EventException {
        try {
            if (super.getBody() != null) {
                return super.getBody().add(element);
            } else {
                throw new EventException("Body can't be null in event when you use BatchEvent");
            }

        } catch (Exception e) {
            throw new EventException(e.getMessage(), e);
        }


    }
}
