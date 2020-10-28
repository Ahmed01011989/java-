package pract3;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        String empName;
        double totalhour;
        double hrate;
        double grosspay;


        System.out.println("Employ Salary Calculator");
        System.out.println("please follow the constroction");


        Scanner scanmachine= new Scanner(System.in);

        System.out.println("Enter Employee Name");
        empName=scanmachine.nextLine();

        System.out.println("Enter Total Houre");
        totalhour=scanmachine.nextDouble();

        System.out.println("Enter horly rate");
        hrate=scanmachine.nextDouble();

        grosspay=totalhour*hrate;


        System.out.println("--------------Pay Check---------------");
        System.out.println("Employe Name is"+empName);
        System.out.println("Total houre is "+totalhour);
        System.out.println("Hourly Rate is "+hrate);
        System.out.println("Gross Pay is "+grosspay);
        System.out.println("========================================");

        System.out.println("Thanks For Using Pay");
    }
}
