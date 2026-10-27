package com.mycompany.week_9_oopr_midterm_lab_activity_3;
import java.util.Scanner;

public class Week_9_OOPR_MIDTERM_LAB_ACTIVITY_3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("            MIDTERM PROGRAMMING ACTIVITIES 1-31         ");
            System.out.println("------------------------------------------------------------");
            System.out.println("[1]  Vowel or Consonant Check      [17] Sum of Squares (1 to n)");
            System.out.println("[2]  Numerical Date Converter      [18] Sum of Sequence (1 to n)");
            System.out.println("[3]  Temperature Message Check     [19] Reverse an Input Number");
            System.out.println("[4]  Air Force Aircraft Labeler    [20] Sum of Powers (1 to n)");
            System.out.println("[5]  Ship Class ID Locator         [21] Asterisk Right-Angle Triangle");
            System.out.println("[6]  Richter Scale Damage Level    [22] Floyd's Triangle");
            System.out.println("[7]  Number to Words Converter     [23] Odd Asterisk Pyramid");
            System.out.println("[8]  Number to Roman Numerals      [24] Number-Repeating Pyramid");
            System.out.println("[9]  Tuition Fee Assessor          [25] Normal Asterisk Pyramid");
            System.out.println("[10] Percentile Grade System       [26] Incrementing Number Pyramid");
            System.out.println("[11] Sequence nos. and Squares     [27] Incrementing Right Triangle");
            System.out.println("[12] Alternating Sequence 1        [28] Row-Repeating Right Triangle");
            System.out.println("[13] Alternating Sequence 2        [29] Continuous Number Right Triangle");
            System.out.println("[14] Factorial Value (n!)          [30] Asterisk Diamond Pattern");
            System.out.println("[15] Fibonacci Sequence of n       [31] Palindromic Number Pyramid");
            System.out.println("[16] Power Value Calculator        [0]  EXIT PROGRAM");
            System.out.println("=======================================================");
            System.out.print("Select a Program Number: ");
            
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Exiting application. Goodbye!");
                break;
            }
            
            runProgram(choice);
        }
        scanner.close();
    }

    private static void runProgram(int choice) {
        switch (choice) {
            case 1: program1(); break;
            case 2: program2(); break;
            case 3: program3(); break;
            case 4: program4(); break;
            case 5: program5(); break;
            case 6: program6(); break;
            case 7: program7(); break;
            case 8: program8(); break;
            case 9: program9(); break;
            case 10: program10(); break;
            case 11: program11(); break;
            case 12: program12(); break;
            case 13: program13(); break;
            case 14: program14(); break;
            case 15: program15(); break;
            case 16: program16(); break;
            case 17: program17(); break;
            case 18: program18(); break;
            case 19: program19(); break;
            case 20: program20(); break;
            case 21: program21(); break;
            case 22: program22(); break;
            case 23: program23(); break;
            case 24: program24(); break;
            case 25: program25(); break;
            case 26: program26(); break;
            case 27: program27(); break;
            case 28: program28(); break;
            case 29: program29(); break;
            case 30: program30(); break;
            case 31: program31(); break;
            default: System.out.println("Invalid selection! Please pick a number from the menu list.");
        }
    }

    // --- ACTIVITY 1: VOWEL OR CONSONANT ---
    private static void program1() {
        System.out.print("Enter a letter: ");
        char ch = scanner.next().charAt(0);
        char upperCh = Character.toUpperCase(ch);
        
        System.out.println("--- 1st Solution (Ladderized If-Else) ---");
        if (!Character.isLetter(ch)) System.out.println("Not a letter");
        else if (upperCh == 'A' || upperCh == 'E' || upperCh == 'I' || upperCh == 'O' || upperCh == 'U')
            System.out.println(ch + " is a VOWEL.");
        else System.out.println(ch + " is a CONSONANT.");

        System.out.println("--- 2nd Solution (Switch Case) ---");
        switch (upperCh) {
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(ch + " is a VOWEL.");
                break;
            default:
                if(Character.isLetter(ch)) System.out.println(ch + " is a CONSONANT.");
                else System.out.println("Not a letter");
        }
    }

    // --- ACTIVITY 2: DATE FORM FORMATION ---
    private static void program2() {
        System.out.print("Enter numerical date (e.g. MM DD YYYY): ");
        int m = scanner.nextInt(), d = scanner.nextInt(), y = scanner.nextInt();
        String monthStr = "";
        
        switch (m) {
            case 1: monthStr = "February"; break; // Fallback mapping based on prompt
            case 2: monthStr = "February"; break;
            case 3: monthStr = "March"; break;
            case 4: monthStr = "April"; break;
            case 5: monthStr = "May"; break;
            case 6: monthStr = "June"; break;
            case 7: monthStr = "July"; break;
            case 8: monthStr = "August"; break;
            case 9: monthStr = "September"; break;
            case 10: monthStr = "October"; break;
            case 11: monthStr = "November"; break;
            case 12: monthStr = "December"; break;
            default: monthStr = "Unknown";
        }
        System.out.println("Formatted Date: " + monthStr + " " + d + ", " + y);
    }

    // --- ACTIVITY 3: TEMPERATURE CHECK ---
    private static void program3() {
        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();
        if (temp < 0) System.out.println("ICE");
        else if (temp <= 100) System.out.println("WATER");
        else System.out.println("STEAM");
    }

    // --- ACTIVITY 4: AIRCRAFT TYPE ---
    private static void program4() {
        System.out.print("Enter observed speed (km/h): ");
        double speed = scanner.nextDouble();
        System.out.print("Enter length (meters): ");
        double len = scanner.nextDouble();
        
        if (speed > 1100 && len > 52) System.out.println("civilian");
        else if (speed <= 500 && len <= 20) System.out.println("military");
        else System.out.println("It's a bird");
    }

    // --- ACTIVITY 5: SHIP CLASS ---
    private static void program5() {
        System.out.print("Enter Class ID letter: ");
        char id = Character.toUpperCase(scanner.next().charAt(0));
        switch (id) {
            case 'B': System.out.println("Battleship"); break;
            case 'C': System.out.println("Cruiser"); break;
            case 'D': System.out.println("Destroyer"); break;
            case 'F': System.out.println("Frigate"); break;
            default: System.out.println("Unknown Ship Identifier");
        }
    }

    // --- ACTIVITY 6: RICHTER DAMAGE CRITERIA ---
    private static void program6() {
        System.out.print("Enter Richter magnitude value: ");
        double n = scanner.nextDouble();
        if (n > 5.0 && n < 5.5) System.out.println("Some damage");
        else if (n >= 5.5 && n < 6.5) System.out.println("Serious damage");
        else if (n >= 6.5 && n < 7.5) System.out.println("Disaster");
        else if (n >= 7.5) System.out.println("Catastrophe");
        else System.out.println("Little or no damage");
    }

    // --- ACTIVITY 7: NUMBERS TO WORDS ---
    private static void program7() {
        System.out.print("Enter a number (Max 3000): ");
        int num = scanner.nextInt();
        if (num > 3000 || num < 0) { System.out.println("Out of Range"); return; }
        
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        
        StringBuilder word = new StringBuilder();
        if (num / 1000 > 0) { word.append(ones[num / 1000]).append(" thousand "); num %= 1000; }
        if (num / 100 > 0) { word.append(ones[num / 100]).append(" hundred "); num %= 100; }
        if (num >= 10 && num < 20) { word.append(teens[num - 10]); }
        else {
            if (num / 10 > 0) word.append(tens[num / 10]).append(" ");
            if (num % 10 > 0) word.append(ones[num % 10]);
        }
        System.out.println("Result words: " + word.toString().trim());
    }

    // --- ACTIVITY 8: ROMAN NUMERALS ---
    private static void program8() {
        System.out.print("Enter a number (Max 3000): ");
        int num = scanner.nextInt();
        int[] vals = {3000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syms = {"MMM", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < vals.length; i++) {
            while (num >= vals[i]) { roman.append(syms[i]); num -= vals[i]; }
        }
        System.out.println("Roman Numeral notation: " + roman);
    }

    // --- ACTIVITY 9: TUITION FEE EVALUATION ---
    private static void program9() {
        System.out.print("Enter base tuition fee amount: ");
        double fee = scanner.nextDouble();
        System.out.print("Enter payment plan key option (1=Cash, 2=Two-Installment, 3=Three-Installment): ");
        int key = scanner.nextInt();
        if (key == 1) fee -= (fee * 0.10);
        else if (key == 2) fee += (fee * 0.05);
        else if (key == 3) fee += (fee * 0.10);
        System.out.printf("Adjusted net tuition fee calculation is: %,.0f\n", fee);
    }
    
// --- ACTIVITY 10: PERCENTILE GRADE EVALUATION ---
private static void program10() {
        System.out.print("Enter numerical grade percentage: ");
        int p = scanner.nextInt();
        if (p >= 98 && p <= 100) System.out.println("1.00");
        else if (p >= 95 && p <= 97) System.out.println("1.25");
        else if (p >= 92 && p <= 94) System.out.println("1.50");
        else if (p >= 89 && p <= 91) System.out.println("1.75");
        else if (p >= 85 && p <= 88) System.out.println("2.00");
        else if (p >= 82 && p <= 84) System.out.println("2.25");
        else if (p >= 80 && p <= 81) System.out.println("2.50");
        else if (p >= 77 && p <= 79) System.out.println("2.75");
        else if (p >= 75 && p <= 76) System.out.println("3.00");
        else System.out.println("Out-of-Range");
    }

// --- ACTIVITY 11: TWO COLUMN SEQUENCES ---
private static void program11() {
        System.out.println("--- Outputs columns using a For Loop ---");
        for (int i = 1; i <= 5; i++) System.out.println(i + "\t" + (i * i));
    }

// --- ACTIVITY 12: ALTERNATING PATTERN SEQUENCE 1 ---
private static void program12() {
        System.out.print("Sequence outputs: ");
        for (int i = 1; i <= 5; i++) System.out.print(i + ", " + (6 - i) + ", ");
        System.out.println();
    }

// --- ACTIVITY 13: ALTERNATING PATTERN SEQUENCE 2 (REVERSED) ---
private static void program13() {
        System.out.print("Sequence outputs: ");
        for (int i = 5; i >= 1; i--) System.out.print(i + ", " + (6 - i) + ", ");
        System.out.println();
    }

// --- ACTIVITY 14: INCREMENTING FACTORIAL CALCULATOR ---
private static void program14() {
        System.out.print("Enter factorial target input (n): ");
        int n = scanner.nextInt(), fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Calculated output structural value: " + fact);
    }

// --- ACTIVITY 15: FIBONACCI GENERATOR ---
private static void program15() {
        System.out.print("Enter target structural limit (n): ");
        int n = scanner.nextInt(), a = 1, b = 1;
        System.out.print("Series progression sequence: ");
        for (int i = 1; i <= n; i++) {
        System.out.print(a + " ");
        int sum = a + b; a = b; b = sum;
    }
        System.out.println();
    }

// --- ACTIVITY 16: EXPONENTIAL POWER CONTEXT ---
private static void program16() {
        System.out.print("Enter base number value: ");
        int b = scanner.nextInt();
        System.out.print("Enter exponent tracking index: ");
        int e = scanner.nextInt(), res = 1;
        for (int i = 1; i <= e; i++) res *= b;
        System.out.println("Power mapping execution result value: " + res);
    }

// --- ACTIVITY 17: SUM OF SQUARES ---
private static void program17() {
        System.out.print("Enter evaluation sequence limit target (n): ");
        int n = scanner.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += (i * i);
        System.out.println("Aggregated functional progression sum: " + sum);
    }

// --- ACTIVITY 18: SUM OF SEQUENCES ---
private static void program18() {
        System.out.print("Enter limit variable boundary value (n): ");
        int n = scanner.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Summation values accumulated output: " + sum);
    }

// --- ACTIVITY 19: REVERSING NUMBERS VALUE ---
private static void program19() {
        System.out.print("Enter an integer array value data sequence: ");
        int n = scanner.nextInt(), rev = 0;
        while (n != 0) { rev = (rev * 10) + (n % 10); n /= 10; }
        System.out.println("Reversed calculation arrangement result: " + rev);
    }

// --- ACTIVITY 20: SUM OF INDIVIDUAL POWERS SERIES ---
private static void program20() {
        System.out.print("Enter sequence threshold (n): ");
        int n = scanner.nextInt(); double structuralSum = 0;
        for (int i = 1; i <= n; i++) structuralSum += Math.pow(i, i);
        System.out.printf("Total accumulated sum calculation string: %.0f\n", structuralSum);
    }

// --- ACTIVITY 21: RIGHT-ANGLE TRIANGLE PATTERN ---
private static void program21() {
        System.out.print("Enter structural row matrix index count: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) System.out.print("*");
        System.out.println();
    }
   }

// --- ACTIVITY 22: FLOYD'S TRIANGLE MATRIX ---
private static void program22() {
        System.out.print("Enter designated target height matrix rows: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= i; j++) System.out.print(((i + j) % 2 == 0 ? "1 " : "0 "));
        System.out.println();
    }
}

// --- ACTIVITY 23: ODD PYRAMID PATTERN ---
private static void program23() {
        System.out.print("Enter structural block depth row count: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int s = 1; s <= r - i; s++) System.out.print(" ");
        for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
        System.out.println();
    }
}

// --- ACTIVITY 24: ROW REPEATING PYRAMID ---
private static void program24() {
        System.out.print("Enter tracking row counts: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int s = 1; s <= r - i; s++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print(i + " ");
        System.out.println();
    }
}

// --- ACTIVITY 25: ASTERISK BASED PYRAMID ---
private static void program25() {
        System.out.print("Enter tracking row values: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int s = 1; s <= r - i; s++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print("* ");
        System.out.println();
    }
}

// --- ACTIVITY 26: INCREMENTAL NUMBER PYRAMID ---
private static void program26() {
        System.out.print("Enter requested tier lines context: ");
        int r = scanner.nextInt(), val = 1;
        for (int i = 1; i <= r; i++) {
        for (int s = 1; s <= r - i; s++) System.out.print(" ");
        for (int j = 1; j <= i; j++) System.out.print((val++) + " ");
        System.out.println();
    }
}

// --- ACTIVITY 27: INCREMENTING RIGHT TRIANGLE ---
private static void program27() {
        System.out.print("Enter maximum row iterations lines: ");
        int r = scanner.nextInt(), val = 1;
        for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= i; j++) System.out.print((val++) + " ");
        System.out.println();
    }
}

// --- ACTIVITY 28: ROW REPEATING RIGHT TRIANGLE ---
private static void program28() {
        System.out.print("Enter total number rows context: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= i; j++) System.out.print(i + " ");
        System.out.println();
    }
}

// --- ACTIVITY 29: COLUMN PATTERN PROGRESSION ---
private static void program29() {
        System.out.print("Enter required height limits tracking index: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= i; j++) System.out.print(j + " ");
        System.out.println();
    }
}

// --- ACTIVITY 30: DIAMOND CREATION SHAPE ---
private static void program30() {
        System.out.print("Enter half structural diamond thickness: ");
        int r = scanner.nextInt();
        for (int i = 1; i <= r; i++) {
        for (int s = 1; s <= r - i; s++) System.out.print(" ");
        for (int j = 1; j <= (2 * i - 1); j++) System.out.print("");
        System.out.println();
    }
        for (int i = r - 1; i >= 1; i--) {
        for (int s = 1; s <= r - i; s++) System.out.print(" ");
        for (int j = 1; j <= (2 * i - 1); j++) System.out.print("");
        System.out.println();
    }
}

// --- ACTIVITY 31: PALINDROMIC NUMBER PYRAMID ---
private static void program31() {
            System.out.print("Enter height layers count: ");
            int r = scanner.nextInt();
            for (int i = 1; i <= r; i++) {
            for (int s = 1; s <= r - i; s++) System.out.print("  ");
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");
            System.out.println();
        }
    }
}