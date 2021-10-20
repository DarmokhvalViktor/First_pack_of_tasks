package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class UntillStop2 {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lower limit of the interval: ");
        int lowerLimit = scan.nextInt();

        System.out.println("Enter the upper limit of the interval: ");
        int upperLimit = scan.nextInt();
        scan.nextLine(); // to avoid "\n" not reading with scan.nextInt()

        System.out.println("Enter next number: ");
        int count = 0;

        while (true) {
            String word = scan.nextLine();
            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(word);
                if (lowerLimit <= number && number <= upperLimit) {
                    sum += number;
                    count += 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occurred");
                break;
            }
        }
        System.out.println("Sum of the array elements is " + sum);

        int arithmeticMean = sum / count;

        System.out.println("Arithmetic mean is " + arithmeticMean);
    }
}
