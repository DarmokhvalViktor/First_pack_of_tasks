package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class NumbersOfDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int sum = 0;
        int count = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
            count += 1;
        }

        System.out.println("Number has " + count + " digits.");
        System.out.println("Sum of digits is " + sum);
    }
}
