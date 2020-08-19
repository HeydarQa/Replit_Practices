package day16_Replit;

import java.util.Scanner;

public class Replit_035GiftCart {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String gift=input.next();
        System.out.println(gift);

        input.close();
        double smartphone=300;
        double laptop=400;
        double charger=15;
        double hat=25;

        if(gift=="Hat"){
            System.out.println("Thank you for your purchase!");

        }else{
            System.out.println("Invalid item!");
        }



    }
}
