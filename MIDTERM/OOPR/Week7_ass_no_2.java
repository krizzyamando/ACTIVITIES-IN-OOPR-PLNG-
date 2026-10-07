package com.mycompany.week7_ass_no_2;
import java.util.Scanner;

public class Week7_ass_no_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
      
        char ch = scanner.next().charAt(0);
        char lowerCh = Character.toLowerCase(ch);
       
        if (Character.isLetter(lowerCh)) {
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("It's a vowel!");
            } else {
                System.out.println("It's a consonant!");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid letter.");
        }
        
        scanner.close();
    }
}
