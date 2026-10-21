package com.mycompany.week_9_assessment_no_1_while_loop;

import java.util.Scanner;

public class Week_9_Assessment_No_1_while_loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int i = 1;
        while (i <= 5) {
            
            System.out.println(name); 
            
            i++;
        }
        scanner.close();
    }
}