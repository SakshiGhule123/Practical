package com.lab.program;

import java.util.concurrent.atomic.AtomicLong;

public class PrimeSumCalculator {
    public static void main(String[] args) {
        int limit = 100; // Define your limit here
        int numThreads = 4; // Define the number of threads

        AtomicLong sum = new AtomicLong(0);

        // Create and start multiple threads
        PrimeSumThread[] threads = new PrimeSumThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new PrimeSumThread(i * (limit / numThreads) + 1, (i + 1) * (limit / numThreads), sum);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (PrimeSumThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);
    }
}

class PrimeSumThread extends Thread {
    private int start;
    private int end;
    private AtomicLong sum;

    public PrimeSumThread(int start, int end, AtomicLong sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    @Override
    public void run() {
        long threadSum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                threadSum += i;
            }
        }
        sum.addAndGet(threadSum);
    }

    // Check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
