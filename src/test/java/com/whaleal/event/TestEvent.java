package com.whaleal.event;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wh
 */
public class TestEvent {


    public static void main( String[] args ) {

        new TestEvent().testheader();
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


    public void testheader(){


        SimpleEvent  simpleEvent = new SimpleEvent();

      /*  Map<String,String>  map =new HashMap<>();
        map.put("aa","aa");
    */


        Map<Integer,String>  map1 =new HashMap<>();
        map1.put(1000,"aa");



        simpleEvent.setHeaders(map1);



        System.out.println(simpleEvent.getHeaders());

    }



    public void testMap(){
        Map<String ,Object> data = new HashMap<>();

        new TestEvent().testMethod(data);

        Map<String,String>  dd = new HashMap<>();

        new TestEvent().testMethod(dd);

        Map<Integer,String>  dd1 = new HashMap<>();

        //new TestEvent().testMethod(dd1);



    }



    public void testMethod(Map<String ,?>  map){
        System.out.println(map);
    }



}
