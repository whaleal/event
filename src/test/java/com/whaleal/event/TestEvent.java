package com.whaleal.event;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author wh
 */
public class TestEvent {


    public static void main( String[] args ) {

        new TestEvent().testBatchEvent();
    }

    public void testConstructor(){
        TimestampedEvent< Object > objectTimestampedEvent = new TimestampedEvent<>();
        objectTimestampedEvent.setHeaders(new HashMap<>());
        objectTimestampedEvent.setBody(new HashMap<>());
        objectTimestampedEvent.setWatermark(System.currentTimeMillis());

        System.out.println(objectTimestampedEvent.toString());
    }



    public void testBatchEvent(){
        ArrayList< String > objects = new ArrayList<>();

        objects.add("new");
        objects.add("new old");

        BatchEvent< String >  ee = new BatchEvent();
        ee.setBody(objects);

        try {
            ee.add("cc");
        } catch (EventException e) {
            e.printStackTrace();
        }

        System.out.println(ee.toString());

    }




}
