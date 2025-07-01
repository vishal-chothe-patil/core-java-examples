package com.expertise.keywords.example;

public class VolatileExample {

    // shared flag between threads
    private volatile boolean running = true;

    public void startWorker() {
        Thread worker = new Thread(() -> {
            System.out.println("Worker started...");

            // keep running until flag becomes false
            while (running) {
                // Simulating some work
            }

            System.out.println("Worker stopped.");
        });

        worker.start();

        // Main thread waits for 2 seconds then stops worker
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread stopping worker...");
        running = false; // worker thread sees this because of `volatile`
    }

    public static void main(String[] args) {
        VolatileExample example = new VolatileExample();
        example.startWorker();
    }
}
