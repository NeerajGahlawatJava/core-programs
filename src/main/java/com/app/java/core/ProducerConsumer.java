package com.app.java.core;

import java.util.LinkedList;

public class ProducerConsumer {

    private LinkedList<Integer> list = new LinkedList<>();
    private int size = 2;

    public void producer() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                if (list.size() >= size) {
                    wait();
                }
                value++;
                System.out.println("Producer produced " + value);
                list.add(value);
                notify();
                Thread.sleep(2000);
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (list.size() == 0) {
                    wait();
                }
                System.out.println("Cosnumer consumed" + list.removeFirst());
                notify();
                Thread.sleep(2000);
            }
        }
    }
}
