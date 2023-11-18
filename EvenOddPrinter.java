package com.lab.program;

public class EvenOddPrinter {
    public static void main(String[] args) {
        // Create two threads, one for even and one for odd numbers
        Thread evenThread = new Thread(new EvenPrinter());
        Thread oddThread = new Thread(new OddPrinter());

        // Start the threads
        evenThread.start();
        oddThread.start();
    }
}

class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

