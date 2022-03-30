package com.whaleal.event;

import java.util.Collection;

/**
 * @author wh
 */
public abstract class AbstractBatchEvent<T extends Collection<E>,E>  extends AbstractEvent< T >{


    public int size(){
        if(super.getBody()!=null){
            return super.getBody().size();
        }else {
            return 0;
        }
    }
}
