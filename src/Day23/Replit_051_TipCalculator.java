package Day23;

import sun.font.CStrike;

import java.util.Scanner;

/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */
public class Replit_051_TipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Split:");
        String split=scan.next();


        System.out.println("Number of people:");
        int numberOfPeople=scan.nextInt();


        System.out.println("Check amount:");
        double checkAmount=scan.nextDouble();


        System.out.println("Service Quality:");
        String serviceQuality=scan.next();

         double tip=0;

        switch (serviceQuality) {
            case "Poor":
                tip =checkAmount * 5 / 100;
                break;
            case "Fair":
                tip = checkAmount * 10 / 100;
                break;
            case "Good":
                tip = checkAmount * 15 / 100;
                break;
            case "Great":
                tip = checkAmount * 20 / 100;
                break;
            case "Excellent":
                tip = checkAmount * 25 / 100;
                break;
            default:
        }

                double totalToPay = checkAmount + tip;
                double totalperPerson = totalToPay / numberOfPeople;
                double tipPerPerson = tip / numberOfPeople;

                String symm=" ";
                for (int i=1;i<=numberOfPeople;i++){
                    symm+="&";

}
                    System.out.print("Number of people entered: "+symm);
                    System.out.println();
                    System.out.println("Total to pay: " + totalToPay);
                    System.out.println("Total tip: "+tip);
                    System.out.println("Total per person: " + totalperPerson);
                    System.out.println("Tip per person: " + tipPerPerson);








    }
}
