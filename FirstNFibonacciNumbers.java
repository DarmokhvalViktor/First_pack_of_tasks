package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class FirstNFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fibo0 = 1;
        int fibo1 = 1;
        int fibo3;
        int number = scan.nextInt();
        int sum = fibo0 + fibo1;
        for (int iteration = 0; iteration < number - 2; iteration++) {
            fibo3 = fibo0 + fibo1;
            fibo0= fibo1;
            fibo1 = fibo3;
            sum += fibo3;
        }
        System.out.println("Sum of N Fibonacci numbers = " + sum);
    }
}
