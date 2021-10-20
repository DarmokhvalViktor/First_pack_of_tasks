package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class CoodrinatePlane {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first coordinate point: ");
        int xCoordinate = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the second coordinate point: ");
        int yCoordinate = scan.nextInt();

        if (xCoordinate > 0 && yCoordinate > 0) {
            System.out.println("I");
            return;
        }

        if (xCoordinate > 0 && yCoordinate < 0) {
            System.out.println("II");
            return;
        }

        if (xCoordinate < 0 && yCoordinate < 0) {
            System.out.println("III");
            return;
        }

        if (xCoordinate < 0 && yCoordinate > 0) {
            System.out.println("IV");
            return;
        }

        System.out.println("Impossible to determinate");
    }

}
