package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class CoodrinatePlane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first coordinate point: ");
        int firstPoint = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the second coordinate point: ");
        int secondPoint = scan.nextInt();
        if (firstPoint > 0) {
            if (secondPoint > 0) {
                System.out.println("I");
                }
            else if (secondPoint < 0) {
                System.out.println("II");
            }
            else {
                System.out.println("Impossible to determine");
            }
        }
        else if (firstPoint < 0) {
            if (secondPoint > 0) {
                System.out.println(("IV"));
            }
            else if (secondPoint < 0) {
                System.out.println("III");
            }
            else {
                System.out.println("Impossible to determine");
            }
        }
        else {
            System.out.println("Impossible to determinate");
        }

    }

}
