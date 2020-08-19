package Day21_Loops;

import java.util.Scanner;

public class Replit_RealEstate047 {
    public static void main(String[] args) {

        //DO NOT CHANGE
        int propertyPrice = 0;
        //int numberOfBedrooms, garageSpots;
        // float metroAccessibility, schoolScore, highwayAccessibility;
        // boolean backyard, smoking, garage;
        //String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your property type:");
        String property = scan.nextLine();

        if (property.equals("Condo")) {
            propertyPrice += 50000;
        } else if (property.equals("Townhouse")) {
            propertyPrice += 75000;
        } else {
            propertyPrice += 95000;
        }

        System.out.println("How many bedrooms do you have?");
        int numberOfBedrooms = scan.nextInt();

        propertyPrice += (30000 * numberOfBedrooms);
        System.out.println(propertyPrice + "**");

        System.out.println("Do you have a backyard?");
        boolean backyard = scan.nextBoolean();

        if (property.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
        } else {
            propertyPrice += 5000;

        }
        System.out.println("Do you have garage?");
        boolean garage = scan.nextBoolean();

        if (garage) {
            System.out.println("How many spots?");
            int garageSpots = scan.nextInt();


            if (garageSpots > 10) {
                System.out.println("Pardon,  it's not a public parking!");
                System.out.println(propertyPrice + "-----");

            } else {
                propertyPrice += 20000 * garageSpots;
            }

            System.out.println(propertyPrice + "********");

            System.out.println("How close is metro station?");
            float metroAccessibility = scan.nextFloat();

            if (metroAccessibility <= 1) {
                propertyPrice += 10000;
            } else if (metroAccessibility > 1 && metroAccessibility < 3) {
                propertyPrice += 5000;
            } else {
                propertyPrice = propertyPrice;
            }

            System.out.println(propertyPrice + "********");

            System.out.println("How close is highway?");
            float highwayAccessibility = scan.nextFloat();

            if (highwayAccessibility <= 1) {
                propertyPrice += 15000;
            } else if (highwayAccessibility > 1 && highwayAccessibility < 5) {
                propertyPrice += 8000;
            } else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
                propertyPrice += 4000;

            } else {
                propertyPrice = propertyPrice;
            }

            System.out.println(propertyPrice + "********");

            System.out.println("What's the rating of nearest school?");
            float schoolScore = scan.nextFloat();

            if (schoolScore > 8 && schoolScore <= 10) {
                propertyPrice += 45000;
            } else if (schoolScore < 8 && schoolScore >= 4) {
                propertyPrice += 20000;

            } else {
                propertyPrice += 5000;
            }

            System.out.println(propertyPrice + "********");

            System.out.println("Does any of your family members smoking?");
            boolean smoking = scan.nextBoolean();

            if (smoking) {
                propertyPrice -= 5000;
            } else {
                propertyPrice = propertyPrice;
            }

            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: " + propertyPrice + "$");


        }
    }
}