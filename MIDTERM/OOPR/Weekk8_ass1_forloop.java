package com.mycompany.weekk8_ass1_forloop;

import java.util.Scanner;

public class Weekk8_ass1_forloop {
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
