package com.mycompany.week_10_oopr_midterm_lab_activity_5;
import java.util.Scanner;

// 1. ABSTRACT CLASS (Demonstrates Abstraction and Encapsulation)

abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Abstract methods to be resolved by concrete subclasses (Polymorphism)
    public abstract double calculateWithdrawalFee();
    public abstract String getAccountType();

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return false;
        }
        this.balance += amount;
        System.out.printf("New %s balance: P%,.2f%n", getAccountType(), this.balance);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return false;
        }

        double fee = calculateWithdrawalFee();
        if (this.balance < (amount + fee)) {
            System.out.println("Error: Insufficient funds. Transaction rejected.");
            return false;
        }

        this.balance -= (amount + fee);
        System.out.printf("Withdrawal fee: P%,.2f | New %s balance: P%,.2f%n", fee, getAccountType(), this.balance);
        return true;
    }
}


// 2. SUBCLASSES (Demonstrates Inheritance and Behavioral Overrides)

class SavingsAccount extends Account {
    
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 0.0; // Savings has no withdrawal fee
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}

class CheckingAccount extends Account {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 10.0; // Checking charges flat ₱10 fee
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}


// 3. MAIN RUNTIME APPLICATION (Demonstrates Polymorphic References)

public class Week_10_OOPR_MIDTERM_Lab_Activity_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the OOP Banking System");
        double openingBalance = readNonNegativeBalance(scanner);

       
        SavingsAccount savingsAccount = new SavingsAccount("SAV-101", openingBalance);
        CheckingAccount checkingAccount = new CheckingAccount("CHK-202", openingBalance);

        
        Account selectedAccount = savingsAccount;

        printAccountSummary(selectedAccount);

        boolean running = true;
        while (running) {
            showMenu();
            System.out.print("Choice: ");
            String choiceInput = scanner.nextLine().trim();

            switch (choiceInput) {
                case "1":
                    System.out.print("Amount to withdraw: ");
                    double withdrawAmt = readPositiveAmount(scanner);
                    if (withdrawAmt > 0) {
                        selectedAccount.withdraw(withdrawAmt);
                    }
                    break;

                case "2":
                    System.out.print("Amount to deposit: ");
                    double depositAmt = readPositiveAmount(scanner);
                    if (depositAmt > 0) {
                        selectedAccount.deposit(depositAmt);
                    }
                    break;

                case "3":
                    printAccountSummary(selectedAccount);
                    break;

                case "4":
                    // Context toggle: swap objects seamlessly without destroying balances
                    if (selectedAccount == savingsAccount) {
                        selectedAccount = checkingAccount;
                    } else {
                        selectedAccount = savingsAccount;
                    }
                    printAccountSummary(selectedAccount);
                    break;

                case "5":
                    System.out.println("Thank you for using the system!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please select from options 1-5.");
                    break;
            }
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("1 Withdraw   2 Deposit   3 Show balance   4 Switch account   5 Exit");
    }

    public static double readNonNegativeBalance(Scanner scanner) {
        while (true) {
            System.out.print("Opening balance: ");
            try {
                double balance = Double.parseDouble(scanner.nextLine());
                if (balance >= 0) {
                    return balance;
                }
                System.out.println("Error: Opening balance cannot be negative.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public static double readPositiveAmount(Scanner scanner) {
        try {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount > 0) {
                return amount;
            }
            System.out.println("Error: Amount must be greater than zero.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Numeric values only.");
        }
        return -1; // Flag representation for failed/rejected numerical parsing
    }

    public static void printAccountSummary(Account account) {
        System.out.printf("Current account: %s | Balance: P%,.2f%n", 
                account.getAccountType(), account.getBalance());
    }
}
