package com.mycompany.week5.assignment.one;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class WEEK5ASSIGNMENTONE {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = reader.readLine();

        System.out.print("Enter second word: ");
        String secondWord = reader.readLine();

        System.out.print("Enter third word: ");
        String thirdWord = reader.readLine();

        System.out.println(firstWord + " " + secondWord + " " + thirdWord);

        scanner.close();
    }
}
