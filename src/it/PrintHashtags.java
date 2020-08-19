package it;

import java.util.Scanner;

public class PrintHashtags {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        //Enter your code here
        String firstName = " ";
        String lastName = "";
        String fullName = lastName + ", " + (firstName);
        String email = "";
        String street = "";
        String city = " ";
        String state = " ";
        String address = " ";
        String contacts =" ";
        int zipCode = 0;
        int age = 0;
        double height = 0;
        double weight = 0;
        boolean isMarried = true;
        long workPh = 0;
        long personalPh = 0;
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        System.out.println("Enter your last name");
        lastName = scan.next();
        fullName = lastName + " "+firstName;
        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city
        System.out.println("Enter your state");
        state = scan.next();
        scan.next();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your work phone number");
        workPh = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your personal phone number");
        personalPh = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        scan.nextLine();
        System.out.println("Are you married?");
        String mStatus = scan.nextLine();
        if (mStatus.equals(isMarried));
        System.out.println("Patient personal information");
        System.out.println("Full name: " +fullName);
        address = street + ", "+ city + ", " + state +" "+zipCode;
        contacts =  "work phone number -" + workPh + ", "+ "personal phone number- "
                + personalPh+ " , "+ "email: " +email;
        System.out.println("Address: "+ address);
        System.out.println("Contacts: " + contacts  );
        System.out.println ("Age: "+ age);
        System.out.println ("Height: "+ height);
        System.out.println ("Weight: "+ weight + " pounds");
        System.out.println("Married?: "+ true);



    }
}
