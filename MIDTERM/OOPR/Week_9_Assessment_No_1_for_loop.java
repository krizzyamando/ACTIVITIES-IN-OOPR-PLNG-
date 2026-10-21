package com.mycompany.week_9_assessment_no_1_for_loop;
import java.util.Scanner;
public class Week_9_Assessment_No_1_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
   
        for (int i = 1; i <= 5; i++) {
            System.out.println(name);
        }
        
        scanner.close();
    }
}