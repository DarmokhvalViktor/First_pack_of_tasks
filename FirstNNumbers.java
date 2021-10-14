package org.darmokhval.first_pack_of_tasks;
import java.util.Scanner;

public class FirstNNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
