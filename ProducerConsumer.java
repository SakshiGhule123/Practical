package com.lab.program;

import java.util.LinkedList;

public class ProducerConsumer {
    public static void main(String[] args) {
        final int BUFFER_SIZE = 5;
        LinkedList<Integer> buffer = new LinkedList<>();

        Thread producerThread = new Thread(new Producer(buffer, BUFFER_SIZE));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private final LinkedList<Integer> buffer;
    private final int bufferSize;
    private int item = 0;

    public Producer(LinkedList<Integer> buffer, int bufferSize) {
        this.buffer = buffer;
        this.bufferSize = bufferSize;
    }

    @Override
    public void run() {
        while (true) {
            try {
                produce(item);
                item++;
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce(int item) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == bufferSize) {
                System.out.println("Buffer is full. Producer is waiting...");
                buffer.wait();
            }
            buffer.add(item);
            System.out.println("Produced: " + item);
            buffer.notify(); // Notify waiting consumers
        }
    }
}

class Consumer implements Runnable {
    private final LinkedList<Integer> buffer;

    public Consumer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
                Thread.sleep(1500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                System.out.println("Buffer is empty. Consumer is waiting...");
                buffer.wait();
            }
            int item = buffer.poll();
            System.out.println("Consumed: " + item);
            buffer.notify(); // Notify waiting producers
        }
    }
}

