package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class InternationalScale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student's grade on an international scale: ");
        String grade = scan.nextLine();
        grade = grade.toUpperCase();
        switch(grade) {
            case "A":
                System.out.println("Відмінно");
                break;
            case "B":
                System.out.println("Добре");
                break;
            case "C":
                System.out.println("Добре");
                break;
            case "D":
                System.out.println("Задовільно");
                break;
            case "E":
                System.out.println("Задовільно");
            case "FX":
                System.out.println("Незадовільно");
                break;
            case "F":
                System.out.println("Незадовільно");
                break;
            default:
                System.out.println("You have entered wrong grade.");
        }
    }
}
