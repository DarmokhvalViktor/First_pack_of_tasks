package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class ExamScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the student's grade: ");
        int score = scan.nextInt();
        if (score >= 90) {
            System.out.println("Відмінно");
        }
        else if (score >= 75) {
            System.out.println("Добре");
        }
        else if (score >= 60) {
            System.out.println("Задовільно");
        }
        else {
            System.out.println("Незадовільно");
        }
    }
}
