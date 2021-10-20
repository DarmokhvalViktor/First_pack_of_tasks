package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the deposit amount: ");
        int depSum = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the interest rate: ");
        double percent = scan.nextInt() * 0.01;
        scan.nextLine();

        System.out.println("Enter the desirable amount of cash you want to receive: ");
        double goalSum = scan.nextInt();

        double finalSum = depSum;
        double annualIncome;
        int yearsCount = 0;

        while (goalSum >= finalSum) {
            annualIncome = finalSum * percent;
            finalSum += annualIncome;
            yearsCount += 1;
        }

        System.out.println("Client can receive amount of " + finalSum + " cash after " + yearsCount + " years.");
    }
}
