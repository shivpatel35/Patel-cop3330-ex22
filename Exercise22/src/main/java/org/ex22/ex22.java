package org.ex22;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highest_num = 0;

        System.out.print("Enter the first number: ");
        int first_num = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second_num = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int third_num = scanner.nextInt();

        if(first_num == second_num || second_num == third_num){
            System.out.print("Your numbers match each other. What are you doing?!");
        }
        else if(first_num >= second_num && first_num >= third_num ){
            first_num = highest_num;
            System.out.println("\nThe largest number is "+ first_num);
        }
        else if( second_num >= first_num && second_num >= third_num){
            second_num = highest_num;
            System.out.println("\nThe largest number is "+ highest_num);
        }
        else if (third_num >= first_num && third_num >= second_num){
            third_num = highest_num;
            System.out.println("\nThe largest number is "+ highest_num);
        }

    }

}
