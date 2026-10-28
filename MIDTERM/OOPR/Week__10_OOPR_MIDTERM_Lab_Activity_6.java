package com.mycompany.week__10_oopr_midterm_lab_activity_6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class Patient {
    protected String name;
    protected Date admissionDate;
    protected String disease;
    protected Date dischargeDate;

    public Patient(String name, Date admissionDate, String disease, Date dischargeDate) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.disease = disease;
        this.dischargeDate = dischargeDate;
    }

    public void display() {
        System.out.println("Name of the patient: " + name);
        System.out.println("Date of admission: " + admissionDate);
        System.out.println("Disease: " + disease);
        System.out.println("Date of discharge: " + dischargeDate);
    }
}

class PediatricPatient extends Patient {
    private int age;

    public PediatricPatient(String name, Date admissionDate, String disease, Date dischargeDate, int age) {
        super(name, admissionDate, disease, dischargeDate);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Age: " + age);
    }
}

class Professor {
    protected String name;
    protected double salary;

    public Professor(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Deans extends Professor {
    protected String department;

    public Deans(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Status\n" +
               "Rank: Dean\n" +
               "Name: " + name + "\n" +
               "Department: " + department + "\n" +
               "Salary: " + salary;
    }
}

class Executive extends Deans {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Status\n" +
               "Rank: Executive\n" +
               "Name: " + name + "\n" +
               "Department: " + department + "\n" +
               "Salary: " + salary;
    }
}


// MAIN  CLASS


public class Week__10_OOPR_MIDTERM_Lab_Activity_6 {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--------------- Program 1-3 ---------------");
            System.out.println("1. Program 1 (Account System)");
            System.out.println("2. Program 2 (Hospital Database)");
            System.out.println("3. Program 3 (Professor Hierarchy)");
            System.out.println("4. EXIT");
            System.out.println("------------------------------------------");
            System.out.print("Select a program to execute (1-4): ");
            
            String mainChoice = scanner.nextLine().trim();

            if (mainChoice.equals("1")) {
                runProgram1();
            } else if (mainChoice.equals("2")) {
                runProgram2();
            } else if (mainChoice.equals("3")) {
                runProgram3();
            } else if (mainChoice.equals("4")) {
                System.out.println("\nTHANK YOU. Goodbye!");
                break;
            } else {
                System.out.println("[Error] Invalid entry. Please enter a value between 1 and 4.");
            }
        }
    }

    private static void runProgram1() {
        System.out.println("\n--- Running Program 1: Account Balance System ---");
        System.out.println("Welcome!");
        
        System.out.println("Enter your balance:");
        int balance = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Select an option:");
        System.out.println("1. Withdraw Amount");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Exit");

        System.out.println("How much amount you want to withdraw from your account?");
        System.out.println("Amount:");
        int withdraw = Integer.parseInt(scanner.nextLine().trim());
        balance -= withdraw;
        System.out.println("Your new balance is: " + balance);

        System.out.println("How much amount you want to deposit in your account?");
        System.out.println("Amount:");
        int deposit = Integer.parseInt(scanner.nextLine().trim());
        balance += deposit;
        System.out.println("Your new balance is: " + balance);

        System.out.println("Thank you for using the system!");
    }

    private static void runProgram2() {
        System.out.println("\n--- Running Program 2: Hospital Database ---");
        List<PediatricPatient> patientsDb = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Insert New Patient-");
            System.out.println("2. Display all Patient");
            System.out.println("3. Display pediatric patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                System.out.print("1. Name of the patient: ");
                String name = scanner.nextLine();

                System.out.println("2. Date of admission:");
                System.out.print(" Enter Date: ");
                int d = Integer.parseInt(scanner.nextLine().trim());
                System.out.print(" Enter Month: ");
                int m = Integer.parseInt(scanner.nextLine().trim());
                System.out.print(" Enter Year: ");
                int y = Integer.parseInt(scanner.nextLine().trim());
                Date admDate = new Date(y, m, d);

                System.out.print("3. Disease: ");
                String disease = scanner.nextLine();

                System.out.println("4. Date of discharge:");
                System.out.print(" Enter Date: ");
                int dDis = Integer.parseInt(scanner.nextLine().trim());
                System.out.print(" Enter Month: ");
                int mDis = Integer.parseInt(scanner.nextLine().trim());
                System.out.print(" Enter Year: ");
                int yDis = Integer.parseInt(scanner.nextLine().trim());
                Date disDate = new Date(yDis, mDis, dDis);

                System.out.print("5. Age: ");
                int age = Integer.parseInt(scanner.nextLine().trim());

                PediatricPatient patient = new PediatricPatient(name, admDate, disease, disDate, age);
                patientsDb.add(patient);

            } else if (choice.equals("2")) {
                System.out.println("\n-------------   All Patients   -------------");
                if (patientsDb.isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    for (PediatricPatient p : patientsDb) {
                        p.display();
                        System.out.println("----------------------------------------");
                    }
                }

            } else if (choice.equals("3")) {
                System.out.println("\n--- Pediatric Patients (< 12 Years) ---");
                boolean pediatricFound = false;
                for (PediatricPatient p : patientsDb) {
                    if (p.getAge() < 12) {
                        p.display();
                        System.out.println("--------------------");
                        pediatricFound = true;
                    }
                }
                if (!pediatricFound) {
                    System.out.println("No pediatric records found.");
                }

            } else if (choice.equals("4")) {
                System.out.println("Exiting Hospital System.");
                break;
            }
        }
    }

    private static void runProgram3() {
        System.out.println("\n--- Running Program 3: Academic Hierarchy Test ---");
        Deans dean = new Deans("John Cena", 32000, "English");
        System.out.println(dean);
        System.out.println(); // Break space

        Executive execStaff = new Executive("Ronald McDonald", 42000, "Computer Science");
        System.out.println(execStaff);
    }
}
