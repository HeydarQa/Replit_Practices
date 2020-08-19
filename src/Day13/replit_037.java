package Day13;

import java.util.Scanner;

public class replit_037 {
    public static void main(String[] args) {
      /*  Scanner input=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons=input.nextInt();

        if(coupons<3) {
            System.out.println("Not enough coupons");
        }else {
            int candies = coupons / 10;
            System.out.println("Number of Candies: " + candies);

            int gumballs = (coupons % 10) / 3;
            System.out.println("Number of Gumballs: " + gumballs);

        }
*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink: ");
        int numOfMilligrams=input.nextInt();

        System.out.println("It would take about "+(10*1000/numOfMilligrams)+" drinks for a lethal overdose.");

    }
}
