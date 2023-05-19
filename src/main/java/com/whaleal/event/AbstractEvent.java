package com.whaleal.event;

import java.util.Map;

/**
 * 抽象的 Event
 *
 * @author wh
 */
public abstract class AbstractEvent< T > implements Event< T > {
    private static final long serialVersionUID = 2022075349620653480L;

    protected Map< String, Object > headers;
    protected T body;

    protected AbstractEvent() {
    }

    protected AbstractEvent( Map< String, Object > headers ) {
        if (headers != null) {
            this.headers = headers;
        }
    }

    @Override
    public Map< String, Object > getHeaders() {
        return this.headers;
    }

    @Override
    public void setHeaders( Map< String, Object > headers ) {
        if (headers != null) {
            this.headers = headers;
        }
    }

    @Override
    public T getBody() {
        return this.body;
    }

    @Override
    public void setBody( T body ) {
        this.body = body;

    }


    @Override
    public String toString() {
        return "[Event headers = " + headers + ", body = " + body + " ]";
    }

    /**
     * destroy method
     * 当一个event 比较大时
     * 我们希望重复利用也好，快速销毁也好
     * 因此添加将body  置为空的方法
     * 以便于body部分 快速被重置
     * 而header 现阶段不考虑。
     *
     */
    @Override
    public void destroy() {

        if (this.body != null) {

            this.body = null;
        }

    }
}
