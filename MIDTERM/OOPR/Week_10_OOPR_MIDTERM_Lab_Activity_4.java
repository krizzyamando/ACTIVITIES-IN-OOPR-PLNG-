package com.mycompany.week_10_oopr_midterm_lab_activity_4;
import java.util.Scanner;

public class Week_10_OOPR_MIDTERM_Lab_Activity_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--------------------------------------------------");
            System.out.println("   MIDTERM PROGRAMMING ACTIVITIES 18-27   ");
            System.out.println("--------------------------------------------------");
            System.out.println("[18] Smart Payslip Generator (Single Employee)");
            System.out.println("[19] Student Information and Tuition Fee Billing");
            System.out.println("[20] Customer Purchase Order with Receipt System");
            System.out.println("[21] Simple Ticketing System (Plain Ticket)");
            System.out.println("[22] Simple Reservation and Billing System");
            System.out.println("[23] Simple CRS - Car Rental System");
            System.out.println("[24] Simple ROS - Restaurant Ordering System");
            System.out.println("[25] Simple Flower Reservation with Billing System");
            System.out.println("[26] KMART Korean Noodles Purchase Order with Billing System");
            System.out.println("[27] Car and Motor Parking Reservation and Billing System");
            
            System.out.println("[0]  Exit Application");
            System.out.println("--------------------------------------------------");
            System.out.print("Select a program to run: ");
            
            // Validate that the input is actually an integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the text entry (like "incorrect") out of memory
                System.out.print("Select a program to run: ");
            }
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the buffer

            switch (choice) {
                case 18: runProg18(scanner); break;
                case 19: runProg19(scanner); break;
                case 20: runProg20(scanner); break;
                case 21: runProg21(scanner); break;
                case 22: runProg22(scanner); break;
                case 23: runProg23(scanner); break;
                case 24: runProg24(scanner); break;
                case 25: runProg25(scanner); break;
                case 26: runProg26(scanner); break;
                case 27: runProg27(scanner); break;
                
                case 0:
                    running = false;
                    System.out.println("Thank You. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection! Please select from the available program options.");
            }
        }
        scanner.close();
    }

    // --- Programming 18: Smart Payslip Generator ---
    private static void runProg18(Scanner scanner) {
        System.out.println("\n--- [PROG 18] Enter Employee Information ---");
        System.out.print("Employee Name: "); String name = scanner.nextLine();
        System.out.print("Employee ID: "); String id = scanner.nextLine();
        System.out.print("Department: "); String dept = scanner.nextLine();
        System.out.print("Basic Monthly Salary: "); double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\n--- Enter Payroll Information ---");
        System.out.print("Payroll Start Date (YYYY-MM-DD): "); String start = scanner.nextLine();
        System.out.print("Payroll End Date (YYYY-MM-DD): "); String end = scanner.nextLine();
        System.out.print("Payout Date (YYYY-MM-DD): "); String payout = scanner.nextLine();

        System.out.println("\n--- Enter Work Details ---");
        System.out.print("Total Regular Hours Worked: "); double regHrs = scanner.nextDouble();
        System.out.print("Overtime Hours Worked: "); double otHrs = scanner.nextDouble();
        System.out.print("Number of Absent Days: "); int absDays = scanner.nextInt();

        System.out.println("\n--- Enter Allowances ---");
        System.out.print("Rice Allowance: "); double rice = scanner.nextDouble();
        System.out.print("Transportation Allowance: "); double trans = scanner.nextDouble();
        System.out.print("Communication Allowance: "); double comm = scanner.nextDouble();

        System.out.println("\n--- Enter Deductions ---");
        System.out.print("SSS Contribution: "); double sss = scanner.nextDouble();
        System.out.print("PhilHealth Contribution: "); double ph = scanner.nextDouble();
        System.out.print("PAG-IBIG Contribution: "); double pi = scanner.nextDouble();
        System.out.print("Withholding Tax: "); double tax = scanner.nextDouble();
        System.out.print("Other Deductions: "); double other = scanner.nextDouble();

        double hourlyRate = salary / 160.0;
        double dailyRate = salary / 20.0;
        double regularPay = regHrs * hourlyRate;
        double overtimePay = otHrs * (hourlyRate * 1.25);
        double absenceDeduction = absDays * dailyRate;
        double totalAllowances = rice + trans + comm;
        double grossPay = regularPay + overtimePay + totalAllowances;
        double totalDeductions = sss + ph + pi + tax + other + absenceDeduction;
        double netPay = grossPay - totalDeductions;

        System.out.println("\n--------------------------------------------------");
        System.out.println("            Smart Employee Payslip ");
        System.out.println("--------------------------------------------------");
        System.out.println("Employee Details");
        System.out.printf("  %-25s: %s%n", "Name", name);
        System.out.printf("  %-25s: %s%n", "Employee ID", id);
        System.out.printf("  %-25s: %s%n", "Department", dept);
        System.out.println("\nPayroll Summary");
        System.out.printf("  %-25s: %s to %s%n", "Pay Period", start, end);
        System.out.printf("  %-25s: %s%n", "Payout Date", payout);
        System.out.println("\nEarnings");
        System.out.printf("  %-25s: Php %,.2f%n", "Regular Pay", regularPay);
        System.out.printf("  %-25s: Php %,.2f%n", "Overtime Pay", overtimePay);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Allowances", totalAllowances);
        System.out.printf("  %-25s: Php %,.2f%n", "Gross Pay", grossPay);
        System.out.println("\nAllowances Breakdown");
        System.out.printf("  %-25s: Php %,.2f%n", "Rice Allowance", rice);
        System.out.printf("  %-25s: Php %,.2f%n", "Transportation Allowance", trans);
        System.out.printf("  %-25s: Php %,.2f%n", "Communication Allowance", comm);
        System.out.println("\nDeductions");
        System.out.printf("  %-25s: Php %,.2f%n", "SSS", sss);
        System.out.printf("  %-25s: Php %,.2f%n", "PhilHealth", ph);
        System.out.printf("  %-25s: Php %,.2f%n", "PAG-IBIG", pi);
        System.out.printf("  %-25s: Php %,.2f%n", "Withholding Tax", tax);
        System.out.printf("  %-25s: Php %,.2f%n", "Absence Deduction", absenceDeduction);
        System.out.printf("  %-25s: Php %,.2f%n", "Other Deductions", other);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Deductions", totalDeductions);
        System.out.println("--------------------------------------------------");
        System.out.printf("Net Pay                    : Php %,.2f%n", netPay);
        System.out.println("--------------------------------------------------");
    }

    // --- Programming 19: Student Information and Tuition Fee Billing ---
    private static void runProg19(Scanner scanner) {
        System.out.println("\n--- [PROG 19] Enter Student Information ---");
        System.out.print("Student Name: "); String name = scanner.nextLine();
        System.out.print("Student ID: "); String id = scanner.nextLine();
        System.out.print("Course/Program: "); String course = scanner.nextLine();
        System.out.print("Year Level: "); int level = scanner.nextInt();

        System.out.println("\n--- Enter Enrollment Details ---");
        System.out.print("Number of Units Enrolled: "); int units = scanner.nextInt();
        System.out.print("Tuition Fee per Unit: "); double feePerUnit = scanner.nextDouble();
        System.out.print("Miscellaneous Fee: "); double misc = scanner.nextDouble();

        System.out.println("\n--- Enter Additional Fees ---");
        System.out.print("Laboratory Fee: "); double lab = scanner.nextDouble();
        System.out.print("Library Fee: "); double lib = scanner.nextDouble();
        System.out.print("Other Fees: "); double other = scanner.nextDouble();

        System.out.println("\n--- Enter Payment Details ---");
        System.out.print("Down Payment: "); double down = scanner.nextDouble();
        System.out.print("Scholarship Discount: "); double discount = scanner.nextDouble();

        double tuitionTotal = units * feePerUnit;
        double addFeesTotal = lab + lib + other;
        double grossTotal = tuitionTotal + misc + addFeesTotal;
        double netTotal = grossTotal - discount;
        double balance = netTotal - down;

        System.out.println("\n--------------------------------------------------");
        System.out.println("            STUDENT TUITION BILLING SYSTEM ");
        System.out.println("--------------------------------------------------");
        System.out.println("Student Details");
        System.out.printf("  %-25s: %s%n", "Name", name);
        System.out.printf("  %-25s: %s%n", "Student ID", id);
        System.out.printf("  %-25s: %s%n", "Course", course);
        System.out.printf("  %-25s: %d%n", "Year Level", level);
        System.out.println("\nEnrollment Summary");
        System.out.printf("  %-25s: %d%n", "Units Enrolled", units);
        System.out.printf("  %-25s: Php %,.2f%n", "Tuition per Unit", feePerUnit);
        System.out.printf("  %-25s: Php %,.2f%n", "Tuition Fee Total", tuitionTotal);
        System.out.println("\nFees Breakdown");
        System.out.printf("  %-25s: Php %,.2f%n", "Miscellaneous Fee", misc);
        System.out.printf("  %-25s: Php %,.2f%n", "Laboratory Fee", lab);
        System.out.printf("  %-25s: Php %,.2f%n", "Library Fee", lib);
        System.out.printf("  %-25s: Php %,.2f%n", "Other Fees", other);
        System.out.printf("  %-25s: Php %,.2f%n", "Gross Total Fee", grossTotal);
        System.out.println("\nPayment Summary");
        System.out.printf("  %-25s: Php %,.2f%n", "Scholarship Discount", discount);
        System.out.printf("  %-25s: Php %,.2f%n", "Net Total Fee", netTotal);
        System.out.printf("  %-25s: Php %,.2f%n", "Down Payment", down);
        System.out.println("--------------------------------------------------");
        System.out.printf("Remaining Balance          : Php %,.2f%n", balance);
        System.out.println("--------------------------------------------------");
    }
    
// --- Programming 20: Customer Purchase Order with Receipt System ---
    private static void runProg20(Scanner scanner) {
        System.out.println("\n--- [PROG 20] Enter Customer Information ---");
        System.out.print("Customer Name: "); String name = scanner.nextLine();
        System.out.print("Customer ID: "); String id = scanner.nextLine();
        int numItems = 3;
        String[] itemNames = new String[numItems];
        int[] quantities = new int[numItems];
        double[] prices = new double[numItems];
        double[] itemTotals = new double[numItems];
        double subtotal = 0;
        System.out.println("\n--- Enter 3 Purchased Items ---");
        for (int i = 0; i < numItems; i++) {
        System.out.println("Item #" + (i + 1) + ":");
        System.out.print("  Item Name: "); itemNames[i] = scanner.nextLine();
        System.out.print("  Quantity: "); quantities[i] = scanner.nextInt();
        System.out.print("  Price per Item: "); prices[i] = scanner.nextDouble();
        scanner.nextLine();
        itemTotals[i] = quantities[i] * prices[i];
        subtotal += itemTotals[i];
    }
        System.out.print("\nDiscount (%): "); double discPct = scanner.nextDouble();
        System.out.print("Amount Tendered: "); double tendered = scanner.nextDouble();
        double discAmt = subtotal * (discPct / 100.0);
        double due = subtotal - discAmt;
        double change = tendered - due;
        System.out.println("\n          CUSTOMER RECEIPT ");
        System.out.println("Customer Details");
        System.out.println("  Name       : " + name);
        System.out.println("  ID         : " + id);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-15s %-15s%n", "Item Name", "Quantity", "Price", "Total");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < numItems; i++) {
        System.out.printf("%-20s %-10d Php %-,11.2f Php %,.2f%n", itemNames[i], quantities[i], prices[i], itemTotals[i]);

       }
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Payment Summary");
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discPct);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discAmt);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Amount Due", due);
        System.out.printf("  %-25s: Php %,.2f%n", "Amount Tendered", tendered);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", "Change", change);
        System.out.println("-----------------------------------------------------------------");
}
// --- Programming 21: Simple Ticketing System (Plain Ticket) ---
    private static void runProg21(Scanner scanner) {
        System.out.println("\n--- [PROG 21] Enter Customer Information ---");
        System.out.print("Customer Name: "); String name = scanner.nextLine();
        System.out.print("Customer ID: "); String id = scanner.nextLine();
        System.out.println("\n--- Enter Ticket Details ---");
        System.out.print("Event Name: "); String event = scanner.nextLine();
        System.out.print("Ticket Type: "); String type = scanner.nextLine();
        System.out.print("Ticket Price: "); double price = scanner.nextDouble();
        System.out.print("Number of Tickets: "); int qty = scanner.nextInt();
        System.out.print("Discount (%): "); double discPct = scanner.nextDouble();
        System.out.print("Amount Tendered: "); double tendered = scanner.nextDouble();
        double cost = price * qty;
        double discAmt = cost * (discPct / 100.0);
        double due = cost - discAmt;
        double change = tendered - due;
        System.out.println("\n------------       EVENT TICKET      ------------");
        System.out.println("Customer Details");
        System.out.printf("  %-25s: %s%n", "Name", name);
        System.out.printf("  %-25s: %s%n", "Customer ID", id);
        System.out.println("--------------------------------------------------");
        System.out.println("Ticket Information");
        System.out.printf("  %-25s: %s%n", "Event Name", event);
        System.out.printf("  %-25s: %s%n", "Ticket Type", type);
        System.out.printf("  %-25s: Php %,.2f%n", "Ticket Price", price);
        System.out.printf("  %-25s: %d%n", "Number of Tickets", qty);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Ticket Cost", cost);
        System.out.println("--------------------------------------------------");
        System.out.println("Payment Summary");
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discPct);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discAmt);
        System.out.printf("  %-25s: Php %,.2f%n", "Final Amount Due", due);
        System.out.printf("  %-25s: Php %,.2f%n", "Amount Tendered", tendered);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", "Change", change);
        System.out.println("--------------------------------------------------");
}
    
// --- Programming 22: Simple Reservation and Billing System ---
    private static void runProg22(Scanner scanner) {
        System.out.println("\n--- [PROG 22] Enter Customer Information ---");
        System.out.print("Customer Name: "); String name = scanner.nextLine();
        System.out.print("Customer ID: "); String id = scanner.nextLine();
        System.out.println("\n--- Enter Reservation Details ---");
        System.out.print("Reservation Type: "); String type = scanner.nextLine();
        System.out.print("Duration (Days/Hours): "); double duration = scanner.nextDouble();
        System.out.print("Rate: "); double rate = scanner.nextDouble();
        System.out.println("\n--- Enter Additional Services ---");
        System.out.print("Food Charges: "); double food = scanner.nextDouble();
        System.out.print("Service Charges: "); double svc = scanner.nextDouble();
        System.out.print("Other Charges: "); double other = scanner.nextDouble();
        System.out.print("Discount (%): "); double discPct = scanner.nextDouble();
        System.out.print("Down Payment: "); double down = scanner.nextDouble();
        double resCost = duration * rate;
        double addCharges = food + svc + other;
        double subtotal = resCost + addCharges;
        double discAmt = subtotal * (discPct / 100.0);
        double totalBill = subtotal - discAmt;
        double balance = totalBill - down;
        System.out.println("\n---------     RESERVATION BILLING     ---------");
        System.out.println("Customer Details");
        System.out.printf("  %-25s: %s%n", "Name", name);
        System.out.printf("  %-25s: %s%n", "Customer ID", id);
        System.out.println("\nReservation Details");
        System.out.printf("  %-25s: %s%n", "Reservation Type", type);
        System.out.printf("  %-25s: %.1f%n", "Duration (Days/Hours)", duration);
        System.out.printf("  %-25s: Php %,.2f%n", "Rate", rate);
        System.out.printf("  %-25s: Php %,.2f%n", "Reservation Cost", resCost);
        System.out.println("\nCharges Breakdown");
        System.out.printf("  %-25s: Php %,.2f%n", "Food Charges", food);
        System.out.printf("  %-25s: Php %,.2f%n", "Service Charges", svc);
        System.out.printf("  %-25s: Php %,.2f%n", "Other Charges", other);
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discPct);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discAmt);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Bill", totalBill);
        System.out.printf("  %-25s: Php %,.2f%n", "Down Payment", down);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", "Remaining Balance", balance);
        System.out.println("--------------------------------------------------");
}
    
// --- Programming 23: Simple CRS – Car Rental System ---
    private static void runProg23(Scanner scanner) {
        System.out.println("\n--- [PROG 23] Enter Customer Information ---");
        System.out.print("Customer Name: "); String name = scanner.nextLine();
        System.out.print("Customer ID: "); String id = scanner.nextLine();
        System.out.print("Driver's License: "); String license = scanner.nextLine();
        System.out.println("\n--- Enter Vehicle details ---");
        System.out.print("Vehicle Type: "); String type = scanner.nextLine();
        System.out.print("Vehicle Model: "); String model = scanner.nextLine();
        System.out.print("Rate per Day: "); double rate = scanner.nextDouble();
        System.out.print("Number of Rental Days: "); int days = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pickup Date (YYYY-MM-DD): "); String pickup = scanner.nextLine();
        System.out.print("Return Date (YYYY-MM-DD): "); String returns = scanner.nextLine();
        System.out.println("\n--- Enter Additional Charges ---");
        System.out.print("Insurance Fee: "); double ins = scanner.nextDouble();
        System.out.print("Fuel Charge: "); double fuel = scanner.nextDouble();
        System.out.print("Other Charges: "); double other = scanner.nextDouble();
        System.out.print("Discount (%): "); double discPct = scanner.nextDouble();
        System.out.print("Amount Paid: "); double paid = scanner.nextDouble();
        double rentalCost = rate * days;
        double addCharges = ins + fuel + other;
        double subtotal = rentalCost + addCharges;
        double discAmt = subtotal * (discPct / 100.0);
        double due = subtotal - discAmt;
        String balanceLabel = (paid >= due) ? "Change" : "Remaining Balance";
        double balanceValue = Math.abs(paid - due);
        System.out.println("\n----------    CAR RENTAL RECEIPT  --------- ");
        System.out.println("Customer Details");
        System.out.printf("  %-25s: %s%n", "Name", name);
        System.out.printf("  %-25s: %s%n", "Customer ID", id);
        System.out.printf("  %-25s: %s%n", "Driver's License", license);
        System.out.println("\nVehicle Information");
        System.out.printf("  %-25s: %s%n", "Vehicle Type", type);
        System.out.printf("  %-25s: %s%n", "Vehicle Model", model);
        System.out.printf("  %-25s: Php %,.2f%n", "Rate per Day", rate);
        System.out.println("\nRental Summary");
        System.out.printf("  %-25s: %s%n", "Pickup Date", pickup);
        System.out.printf("  %-25s: %s%n", "Return Date", returns);
        System.out.printf("  %-25s: %d%n", "Number of Days", days);
        System.out.printf("  %-25s: Php %,.2f%n", "Rental Cost", rentalCost);
        System.out.println("\nCharges Breakdown");
        System.out.printf("  %-25s: Php %,.2f%n", "Insurance Fee", ins);
        System.out.printf("  %-25s: Php %,.2f%n", "Fuel Charge", fuel);
        System.out.printf("  %-25s: Php %,.2f%n", "Other Charges", other);
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discPct);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discAmt);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Amount Due", due);
        System.out.printf("  %-25s: Php %,.2f%n", "Amount Paid", paid);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", balanceLabel, balanceValue);
        System.out.println("--------------------------------------------------");
}
    
// --- Programming 24: Simple ROS – Restaurant Ordering System ---
    private static void runProg24(Scanner scanner) {
        System.out.println("\n--- [PROG 24] Enter Customer Information ---");
        System.out.print("Customer Name: "); String name = scanner.nextLine();
        System.out.print("Order Type (Dine-In or Takeout): "); String type = scanner.nextLine();
        int totalItems = 3;
        String[] itemNames = new String[totalItems];
        int[] quantities = new int[totalItems];
        double[] unitPrices = new double[totalItems];
        double[] itemTotals = new double[totalItems];
        double subtotal = 0;
        System.out.println("\n--- Enter Menu Items ---");
        for (int i = 0; i < totalItems; i++) {
        System.out.println("Item #" + (i + 1) + ":");
        System.out.print("  Item Name: "); itemNames[i] = scanner.nextLine();
        System.out.print("  Quantity: "); quantities[i] = scanner.nextInt();
        System.out.print("  Price per Item: "); unitPrices[i] = scanner.nextDouble();
        scanner.nextLine();
        itemTotals[i] = quantities[i] * unitPrices[i];
        subtotal += itemTotals[i];
    }
        System.out.print("\nService Charge (Dine-In only; enter 0 if Takeout): "); double svc = scanner.nextDouble();
        System.out.print("Packaging Fee (Takeout only; enter 0 if Dine-In): "); double pkg = scanner.nextDouble();
        System.out.print("Discount (%): "); double discPct = scanner.nextDouble();
        System.out.print("Amount Tendered: "); double tendered = scanner.nextDouble();
        double appCharge = type.equalsIgnoreCase("Dine-In") ? svc : pkg;
        String chargeLabel = type.equalsIgnoreCase("Dine-In") ? "Service Charge" : "Packaging Fee";
        double beforeDiscount = subtotal + appCharge;
        double discAmt = beforeDiscount * (discPct / 100.0);
        double due = beforeDiscount - discAmt;
        double change = tendered - due;
        System.out.println("\n--------------------    RESTAURANT RECEIPT  --------------------");
        System.out.println("Customer Details");
        System.out.println("  Name       : " + name);
        System.out.println("  Order Type : " + type);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-15s %-15s%n", "Item Name", "Quantity", "Price", "Total");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < totalItems; i++) {
        System.out.printf("%-20s %-10d Php %-,11.2f Php %,.2f%n", itemNames[i], quantities[i], unitPrices[i], itemTotals[i]);

    }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Billing Summary");
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        System.out.printf("  %-25s: Php %,.2f%n", chargeLabel, appCharge);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Before Discount", beforeDiscount);
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discPct);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discAmt);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Amount Due", due);
        System.out.printf("  %-25s: Php %,.2f%n", "Amount Tendered", tendered);
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", "Change", change);
        System.out.println("-----------------------------------------------------------------");
}
// --- Programming 25: Simple Flower Reservation with Billing System ---
    private static void runProg25(Scanner scanner) {
        System.out.println("\n--- [PROG 25] Enter Customer Information ---");
        System.out.print("Customer Name: "); String name = scanner.nextLine();
        System.out.print("Customer ID: "); String id = scanner.nextLine();
        System.out.print("Contact Number: "); String contact = scanner.nextLine();
        System.out.println("\n--- Enter Reservation Details ---");
        System.out.print("Flower Type: "); String flType = scanner.nextLine();
        System.out.print("Arrangement Type: "); String arrType = scanner.nextLine();
        System.out.print("Price per Arrangement: "); double price = scanner.nextDouble();
        System.out.print("Quantity: "); int qty = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Reservation Date (YYYY-MM-DD): "); String resDate = scanner.nextLine();
        System.out.print("Pickup/Delivery Date (YYYY-MM-DD): "); String delDate = scanner.nextLine();
        System.out.println("\n--- Enter Additional Services ---");
        System.out.print("Delivery Fee: "); double delFee = scanner.nextDouble();
        System.out.print("Customization Fee: "); double custFee = scanner.nextDouble();
        System.out.print("Other Charges: "); double other = scanner.nextDouble();
        System.out.print("Discount (%): "); double discPct = scanner.nextDouble();
        System.out.print("Down Payment: "); double down = scanner.nextDouble();
        double resCost = price * qty;
        double addCharges = delFee + custFee + other;
        double subtotal = resCost + addCharges;
        double discAmt = subtotal * (discPct / 100.0);
        double totalBill = subtotal - discAmt;
        double balance = totalBill - down;
        System.out.println("\n-----     FLOWER RESERVATION RECEIPT      -----");
        System.out.println("Customer Details");
        System.out.printf("  %-25s: %s%n", "Name", name);
        System.out.printf("  %-25s: %s%n", "Customer ID", id);
        System.out.printf("  %-25s: %s%n", "Contact Number", contact);
        System.out.println("\nReservation Summary");
        System.out.printf("  %-25s: %s%n", "Flower Type", flType);
        System.out.printf("  %-25s: %s%n", "Arrangement Type", arrType);
        System.out.printf("  %-25s: %d%n", "Quantity", qty);
        System.out.printf("  %-25s: Php %,.2f%n", "Price per Arrangement", price);
        System.out.printf("  %-25s: Php %,.2f%n", "Reservation Cost", resCost);
        System.out.printf("  %-25s: %s%n", "Reservation Date", resDate);
        System.out.printf("  %-25s: %s%n", "Pickup/Delivery Date", delDate);
        System.out.println("\nCharges Breakdown");
        System.out.printf("  %-25s: Php %,.2f%n", "Delivery Fee", delFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Customization Fee", custFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Other Charges", other);
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        System.out.println("\nPayment Summary");
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discPct);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discAmt);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Bill", totalBill);
        System.out.printf("  %-25s: Php %,.2f%n", "Down Payment", down);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", "Remaining Balance", balance);
        System.out.println("--------------------------------------------------");
}
    private static void runProg26(Scanner scanner) {
        System.out.println("--- Enter Customer Information ---");
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = scanner.nextLine();

        // 2. Order Details
        System.out.println("\n--- Enter Order Details ---");
        System.out.print("Product Name (e.g., Shin Ramyun, Chapagetti): ");
        String productName = scanner.nextLine();
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Price per Pack: ");
        double pricePerPack = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        // 3. Additional Charges
        System.out.println("\n--- Enter Additional Charges ---");
        System.out.print("Packaging Fee: ");
        double packagingFee = scanner.nextDouble();
        System.out.print("Delivery Fee: ");
        double deliveryFee = scanner.nextDouble();

        // 4. Payment Details
        System.out.println("\n--- Enter Payment Details ---");
        System.out.print("Discount (%): ");
        double discountPercent = scanner.nextDouble();
        System.out.print("Cash Payment: ");
        double cashPayment = scanner.nextDouble();

        // --- Computation and Business Logic ---
        double totalProductCost = pricePerPack * quantity;
        double subtotal = totalProductCost + packagingFee + deliveryFee;
        double discountAmount = subtotal * (discountPercent / 100.0);
        double totalBill = subtotal - discountAmount;

        // Conditional change or remaining balance calculation logic
        String balanceLabel;
        double balanceValue;
        if (cashPayment >= totalBill) {
            balanceLabel = "Change";
            balanceValue = cashPayment - totalBill;
        } else {
            balanceLabel = "Remaining Balance";
            balanceValue = totalBill - cashPayment;
        }

        // --- Output  ---
        System.out.println("\n-------- KMART PURCHASE RECEIPT --------");
        System.out.println("Customer Details");
        System.out.printf("  %-25s: %s%n", "Name", customerName);
        System.out.printf("  %-25s: %s%n", "Customer ID", customerId);
        System.out.printf("  %-25s: %s%n", "Contact Number", contactNumber);
        
        System.out.println("\nOrder Summary");
        System.out.printf("  %-25s: %s%n", "Product Name", productName);
        System.out.printf("  %-25s: %s%n", "Brand", brand);
        System.out.printf("  %-25s: Php %,.2f%n", "Price per Pack", pricePerPack);
        System.out.printf("  %-25s: %d%n", "Quantity", quantity);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Product Cost", totalProductCost);
        
        System.out.println("\nCharges");
        System.out.printf("  %-25s: Php %,.2f%n", "Packaging Fee", packagingFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Delivery Fee", deliveryFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        
        System.out.println("\nPayment Summary");
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discountPercent);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discountAmount);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Bill", totalBill);
        System.out.printf("  %-25s: Php %,.2f%n", "Cash Payment", cashPayment);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", balanceLabel, balanceValue);
        System.out.println("--------------------------------------------------");
    }
     private static void runProg27(Scanner scanner) {
         // 1. Customer Information
        System.out.println("--- Enter Customer Information ---");
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Contact Number: ");
        String contactNumber = scanner.nextLine();

        // 2. Vehicle Information
        System.out.println("\n--- Enter Vehicle Information ---");
        System.out.print("Vehicle Type (Car or Motorcycle): ");
        String vehicleType = scanner.nextLine();
        System.out.print("Plate Number: ");
        String plateNumber = scanner.nextLine();

        // 3. Parking Reservation Details
        System.out.println("\n--- Enter Parking Reservation Details ---");
        System.out.print("Entry Time (HH:MM): ");
        String entryTimeStr = scanner.nextLine();
        System.out.print("Exit Time (HH:MM): ");
        String exitTimeStr = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Reservation Fee: ");
        double reservationFee = scanner.nextDouble();

        // 4. Additional Charges
        System.out.println("\n--- Enter Additional Charges ---");
        System.out.print("Overnight Fee (if applicable): ");
        double overnightFee = scanner.nextDouble();
        System.out.print("Penalty Fee (for exceeding reserved time): ");
        double penaltyFee = scanner.nextDouble();

        // 5. Payment Details
        System.out.println("\n--- Enter Payment Details ---");
        System.out.print("Discount (%): ");
        double discountPercent = scanner.nextDouble();
        System.out.print("Cash Payment: ");
        double cashPayment = scanner.nextDouble();

        // --- Computation and Business Logic ---
        // Calculate Total Parking Hours from HH:MM strings
        String[] entryParts = entryTimeStr.split(":");
        String[] exitParts = exitTimeStr.split(":");
        
        int entryHour = Integer.parseInt(entryParts[0]);
        int entryMinute = Integer.parseInt(entryParts[1]);
        int exitHour = Integer.parseInt(exitParts[0]);
        int exitMinute = Integer.parseInt(exitParts[1]);

        int totalEntryMinutes = (entryHour * 60) + entryMinute;
        int totalExitMinutes = (exitHour * 60) + exitMinute;

        // Handles standard overnight wrap-around variations if exit minute count is lower than entry minutes
        if (totalExitMinutes < totalEntryMinutes) {
            totalExitMinutes += 24 * 60; 
        }

        double totalParkingHours = (totalExitMinutes - totalEntryMinutes) / 60.0;
        double parkingFee = totalParkingHours * hourlyRate;
        
        double subtotal = parkingFee + reservationFee + overnightFee + penaltyFee;
        double discountAmount = subtotal * (discountPercent / 100.0);
        double totalBill = subtotal - discountAmount;

        // Payment Calculation (Change or Balance checking)
        String balanceLabel;
        double balanceValue;
        if (cashPayment >= totalBill) {
            balanceLabel = "Change";
            balanceValue = cashPayment - totalBill;
        } else {
            balanceLabel = "Remaining Balance";
            balanceValue = totalBill - cashPayment;
        }

        // --- Output Requirements ---
        System.out.println("\n------------  PARKING RECEIPT   ------------");
        System.out.println("Customer Details");
        System.out.printf("  %-25s: %s%n", "Name", customerName);
        System.out.printf("  %-25s: %s%n", "Customer ID", customerId);
        System.out.printf("  %-25s: %s%n", "Contact Number", contactNumber);
        
        System.out.println("\nVehicle Details");
        System.out.printf("  %-25s: %s%n", "Vehicle Type", vehicleType);
        System.out.printf("  %-25s: %s%n", "Plate Number", plateNumber);
        
        System.out.println("\nParking Summary");
        System.out.printf("  %-25s: %s%n", "Entry Time", entryTimeStr);
        System.out.printf("  %-25s: %s%n", "Exit Time", exitTimeStr);
        System.out.printf("  %-25s: %,.2f hours%n", "Total Hours", totalParkingHours);
        System.out.printf("  %-25s: Php %,.2f%n", "Hourly Rate", hourlyRate);
        System.out.printf("  %-25s: Php %,.2f%n", "Parking Fee", parkingFee);
        
        System.out.println("\nCharges Breakdown");
        System.out.printf("  %-25s: Php %,.2f%n", "Reservation Fee", reservationFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Overnight Fee", overnightFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Penalty Fee", penaltyFee);
        System.out.printf("  %-25s: Php %,.2f%n", "Subtotal", subtotal);
        
        System.out.println("\nPayment Summary");
        System.out.printf("  %-25s: %.1f%%%n", "Discount (%)", discountPercent);
        System.out.printf("  %-25s: Php %,.2f%n", "Discount Amount", discountAmount);
        System.out.printf("  %-25s: Php %,.2f%n", "Total Bill", totalBill);
        System.out.printf("  %-25s: Php %,.2f%n", "Cash Payment", cashPayment);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: Php %,.2f%n", balanceLabel, balanceValue);
        System.out.println("--------------------------------------------------");
     }
}
