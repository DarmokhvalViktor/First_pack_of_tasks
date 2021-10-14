package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class FirstNFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f1 = 1;
        int f2 = 1;
        int f3;
        int number = scan.nextInt();
        int sum = f1 + f2;
        for (int iteration = 0; iteration < number - 2; iteration++) {
            f3 = f1 + f2;
            f1= f2;
            f2 = f3;
            sum += f3;
        }
        System.out.println("Sum of N Fibonacci numbers = " + sum);
    }
}
