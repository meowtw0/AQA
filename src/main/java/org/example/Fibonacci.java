package org.example;

public class Fibonacci {
    public static void main(String[] args) {
        int fibNumber = 5;
        int result = calculateFibonacci(fibNumber);
        System.out.println(result);
    }
    static int calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int fib1 = 0;
        int fib2 = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        return fib2;
    }
}