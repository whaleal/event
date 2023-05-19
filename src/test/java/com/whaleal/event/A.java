package com.whaleal.event;

/**
 * @author wh
 */
import java.time.Instant;

public class A {
    public static void main(String[] args) {
        long a = 0;
        long start = System.currentTimeMillis();
        long  middle = 0 ;
        for (int i = 0; i < 10_000_0000; i++) {
            //middle= Instant.now().toEpochMilli();
            middle= System.currentTimeMillis();
        }
        System.out.println(a);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(middle);
    }
}