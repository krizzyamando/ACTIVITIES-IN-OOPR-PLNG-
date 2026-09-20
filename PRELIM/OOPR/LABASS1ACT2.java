package com.mycompany.lab.ass1.act2;
import java.util.Scanner;

public class LABASS1ACT2 {
    public static void main(String[] args) {
    double x, y;
    String z;
    Scanner scanner = new Scanner(System.in);
do {
    System.out.print("Enter your X: ");
    x = scanner.nextDouble();
    System.out.print("Enter your Y: ");
    y = scanner.nextDouble();
    System.out.println("Arithmetic Operations: ");
    double add, diff, times, div, mod, in, inn, dee, de;
    
    add = x + y;
    diff = x - y;
    times = x * y;
    div = x / y;
    mod = x % y;
    in = x++;
    inn = y++;
    de = x--;
    dee = y--;
    
    System.out.println("Addition: " + add);
    System.out.println("Subtraction: " + diff);
    System.out.println("Multiplication: " + times);
    System.out.println("Division: " + div);
    System.out.println("Modulus: " + mod);
    System.out.println("Increment of X: " + in);
    System.out.println("Increment of Y: " + inn);
    System.out.println("Decrement of X: " + de);
    System.out.println("Decrement of Y: " + dee);
    System.out.print("\nDo you want to continue: ");
    scanner.nextLine(); // Consume leftover newline
    z = scanner.nextLine();
} while (z.equalsIgnoreCase("yes"));

}
}