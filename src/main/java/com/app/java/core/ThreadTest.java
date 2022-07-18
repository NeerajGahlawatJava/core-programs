package com.app.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ThreadTest {

    public static void main(String... s){

        Runnable runnable = ()->{
            for(int i=0;i<5;i++){
                System.out.println(" i = Thread name "+ i +Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();

        for(int i=0;i<5;i++){
            System.out.println(" i = Thread name "+ i +Thread.currentThread().getName());
        }

        Comparator<Integer> comparator = (i1,i2)->i1>i2?1:i1<i2?-1:0;
        Collections.sort(new ArrayList<Integer>(), comparator);
    }
}
