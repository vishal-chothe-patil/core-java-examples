package com.expertise.keywords.example;

public class SynchronizedExample {
    private int counter = 0;

    // Synchronized method: only one thread can execute this at a time
    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final counter should be 2000 due to synchronization
        System.out.println("Final Counter Value: " + example.getCounter());
    }
}
