package com.app.java.core;

public class EvenOdd {

    private int value = 0;

    public void even() throws InterruptedException {
        while (true){
            synchronized (this){
                if(value%2!=0){
                    wait();
                }
                System.out.println("Even "+value);
                value++;
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void odd() throws InterruptedException {
        while (true){
            synchronized (this){
                if(value%2==0){
                    wait();
                }
                System.out.println("Odd "+value);
                value++;
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
