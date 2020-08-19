package it;

import java.util.Scanner;

public class Replit024_PationInformation {
    public static void main(String[] args) {
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName=scan.next();

        System.out.println("Enter your last name");
        String lastName=scan.next();


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();

        scan.nextLine();//to capture Enter key press

        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city


        System.out.println("Enter your city");
        String city=scan.next();


        System.out.println("Enter your state");
        String state=scan.next();

        System.out.println("Enter your zip code");
        String zipcode=scan.next();

        System.out.println("Enter your work phone number");
        long workPhonenumber=scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhonenumber=scan.nextLong();

        System.out.println("Enter your age");
        int age=scan.nextInt();

        System.out.println("Enter your height");
        double height=scan.nextDouble();

        System.out.println("Enter your weight");
        double weight=scan.nextDouble();

        System.out.println("Are you married?");
        boolean married=scan.nextBoolean();


        System.out.println("Full name: "+firstName+", "+lastName);
        System.out.println("Address: "+street);
        System.out.println("Contacts: work phone number - "+workPhonenumber+", personal phone number - "+personalPhonenumber
        +", email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married: "+married);



    }
}
