package com.mycompany.week8_ass1_whileloop;

import java.util.Scanner;

public class Week8_ass1_whileloop {

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
