package com.mycompany.week_9_assignment_no_2;
import java.util.Scanner;

public class Week_9_Assignment_No_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        char choice = 'y';

      
        while (choice != 'n' && choice != 'N') {
            
            System.out.print("Enter a number from 1-10: ");
            number = sc.nextInt();

            
            switch (number) {
                case 1:  System.out.println("One"); break;
                case 2:  System.out.println("Two"); break;
                case 3:  System.out.println("Three"); break;
                case 4:  System.out.println("Four"); break;
                case 5:  System.out.println("Five"); break;
                case 6:  System.out.println("Six"); break;
                case 7:  System.out.println("Seven"); break;
                case 8:  System.out.println("Eight"); break;
                case 9:  System.out.println("Nine"); break;
                case 10: System.out.println("Ten"); break;
                default: System.out.println("Invalid Number"); break;
            }

            System.out.print("Again? y/n: ");
            choice = sc.next().charAt(0);
            System.out.println();
        }

        System.out.println("Exiting.....");
    }
}
