package com.mycompany.labactivity_program_1_to_7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Student {
    private String studentNo;
    private String studentName;
    private Date dateOfBirth;
    private Integer tariffPoints;
    public static int noOfStudents = 0;

    // Getters and Setters
    public String getStudentNo() { return studentNo; }
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public Integer getTariffPoints() { return tariffPoints; }
    public void setTariffPoints(Integer tariffPoints) {
        if(tariffPoints != null && tariffPoints >= 20 && tariffPoints <= 280)
            this.tariffPoints = tariffPoints;
        else
            this.tariffPoints = 20;
    }

 
    @SuppressWarnings("deprecation")
    public Student() {
        this.studentNo = "not known";
        this.studentName = "not known";
        this.dateOfBirth = new Date("1995/01/01");
        this.tariffPoints = 20;
        noOfStudents++;
    }

  
    public Student(String studentNo, String studentName, Date dateOfBirth, Integer tariffPoints) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        setTariffPoints(tariffPoints);
        noOfStudents++;
    }
}

public class Labactivity_program_1_to_7 {
    static Scanner sc = new Scanner(System.in);

    public static void program1() {
        System.out.println("Enter 10 numbers:");
        double[] arr = new double[10];
        double sumPos = 0, avgPos;
        int countPos = 0, countNeg = 0;
        double min;

        for(int i=0; i<10; i++) arr[i] = sc.nextDouble();

        for(int i=0; i<10; i++) {
            if(arr[i] > 0) { sumPos += arr[i]; countPos++; }
        }
        avgPos = countPos > 0 ? sumPos / countPos : 0;
        System.out.println("Sum of positive numbers: " + sumPos);
        System.out.println("Average of positive numbers: " + avgPos);

        for(int i=0; i<10; i++) {
            if(arr[i] < 0) countNeg++;
        }
        System.out.println("Count of negative numbers: " + countNeg);

        min = arr[0];
        for(int i=1; i<10; i++) {
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Minimum value: " + min);
    }

    public static void program2() {
        System.out.println("Enter 8 integers:");
        int[] arr = new int[8];
        for(int i=0; i<8; i++) arr[i] = sc.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr) set.add(num);
        Integer[] noDup = set.toArray(new Integer[0]);
        System.out.print("Array after removing duplicates: ");
        for(int n : noDup) System.out.print(n+" ");
        System.out.println();

        Arrays.sort(arr);
        int secLargest = arr[arr.length-2];
        int secSmallest = arr[1];
        System.out.println("Second Largest: " + secLargest);
        System.out.println("Second Smallest: " + secSmallest);
    }

    public static void program3() {
        int[] arr = {10,20,30,40,50};
        System.out.print("Enter Data in Array: ");
        for(int n : arr) System.out.print(n+" ");
        System.out.println();
        System.out.print("Stored Data in Array: ");
        for(int n : arr) System.out.print(n+" ");
        System.out.println();

        System.out.print("Enter poss. of Element to Delete: ");
        int pos = sc.nextInt();
       
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position!");
            return;
        }

        int[] newArr = new int[arr.length-1];
        for(int i=0,j=0; i<arr.length; i++) {
            if(i != pos) newArr[j++] = arr[i];
        }

        System.out.print("New data in Array: ");
        for(int n : newArr) System.out.print(n+" ");
        System.out.println();
    }

    public static void program4() {
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter any " + size + " elements in Array:");
        for(int i=0; i<size; i++) arr[i] = sc.nextInt();

        System.out.print("Even Elements: ");
        for(int n : arr) if(n%2==0) System.out.print(n + " ");
        System.out.println();
        System.out.print("Odd Elements: ");
        for(int n : arr) if(n%2!=0) System.out.print(n + " ");
        System.out.println();
    }

    public static void program5() {
        System.out.println("\"AA\"A\"");
    }

    @SuppressWarnings("deprecation")
public static void program6() {
    // Clear out newline characters left over in the scanner buffer
    sc.nextLine();
   
    System.out.println("--- Creating Student 1 (Default) ---");
    Student s1 = new Student();
   
    System.out.println("--- Creating Student 2 (User Input) ---");
    System.out.print("Enter Student Number: ");
    String userNo = sc.nextLine();
   
    System.out.print("Enter Student Name: ");
    String userName = sc.nextLine();
   
    System.out.print("Enter Date of Birth (YYYY/MM/DD): ");
    String userDobString = sc.nextLine();
    Date userDob = new Date(userDobString);
   
    System.out.print("Enter Tariff Points (20 - 280): ");
    int userPoints = sc.nextInt();
    Student s2 = new Student(userNo, userName, userDob, userPoints);
   
    System.out.println("\n--- Student Registry Logs ---");
    System.out.println("Stude6nt 1: " + s1.getStudentNo() + " | " + s1.getStudentName() + " | " + s1.getTariffPoints());
    System.out.println("Student 2: " + s2.getStudentNo() + " | " + s2.getStudentName() + " | " + s2.getTariffPoints());
    System.out.println("Total Students Instance Count: " + Student.noOfStudents);
}


    public static void program7() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            File file = new File("data.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split("\t");
                PreparedStatement pst = con.prepareStatement("INSERT INTO records VALUES(?, ?, ?, ?)");
                for(int i=0; i<data.length; i++) pst.setString(i+1, data[i]);
                pst.executeUpdate();
            }
            br.close(); con.close();
            System.out.println("Data inserted successfully.");
        } catch(Exception e) { System.out.println("Error: "+e.getMessage()); }
    }

    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("Choose the program you want to run");
            System.out.println("Number 1");
            System.out.println("Number 2");
            System.out.println("Number 3");
            System.out.println("Number 4");
            System.out.println("Number 5");
            System.out.println("Number 6");
            System.out.println("Number 7");
            System.out.print("Enter choice: ");
            int opt = sc.nextInt();
            System.out.println();

            switch(opt) {
                case 1: program1(); break;
                case 2: program2(); break;
                case 3: program3(); break;
                case 4: program4(); break;
                case 5: program5(); break;
                case 6: program6(); break;
                case 7: program7(); break;
                default: System.out.println("Invalid choice.");
            }
            System.out.print("\nDo you want to continue ? Y/N: ");
            choice = sc.next().charAt(0);
            System.out.println();
        } while(choice == 'Y' || choice == 'y');
        System.out.println("Program ended.");
    }
}
