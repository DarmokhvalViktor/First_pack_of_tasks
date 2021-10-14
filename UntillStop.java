package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;
import java.util.ArrayList;

public class UntillStop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList numbers = new ArrayList();
        int number;
        System.out.println("Enter new number: ");
        int sum = 0;

        while (true) {
            String word = scan.nextLine();
            if (word.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                number = Integer.parseInt(word);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occured");
                break;
            }
            sum += number;
        }
        System.out.println("Sum of the array elements is " + sum);

        int arithmeticMean = sum / numbers.size();

        System.out.println("Arithmetic mean is " + arithmeticMean);
    }
}
