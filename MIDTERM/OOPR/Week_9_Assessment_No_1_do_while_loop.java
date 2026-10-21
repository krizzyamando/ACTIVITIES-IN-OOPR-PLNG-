package com.mycompany.week_9_assessment_no_1_do_while_loop;
import java.util.Scanner;
public class Week_9_Assessment_No_1_do_while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int count = 0;
        do {
            System.out.println(name);
            count++;
        } while (count < 5);
        
        scanner.close();
    }
}
