package com.app.java.core;

public class EvenOddTest {

    public static void main(String... s){

        EvenOdd evenOdd = new EvenOdd();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    evenOdd.even();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    evenOdd.odd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
