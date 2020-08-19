package Day21_Loops;

import java.util.Scanner;

public class Shopping_List {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1=scan.next();
        int count1=scan.nextInt();
        double price1=scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2=scan.next();
        int count2=scan.nextInt();
        double price2=scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3=scan.next();
        int count3=scan.nextInt();
        double price3=scan.nextDouble();

        double totalPrice1=count1*price1;
        double totalPrice2=count2*price2;
        double totalPrice3=count3*price3;

/*

        if (count1>0){
            System.out.println("Item1: "+item1+" Price: "+totalPrice1+", ");
        }else if (count2>0){
            System.out.println("Item2: "+item2+" Price: "+totalPrice2+", ");
        }else if (count3>0){
            System.out.println("Item3: "+item3+" Price: "+totalPrice3);
        }else {
            System.out.println("");
        }
*/
        if (count1>0){
            System.out.print("Item1: "+item1+" Price: "+totalPrice1+", ");

        }else {
            System.out.println();
        }
        if (count2>0){
            System.out.print("Item2: "+item2+" Price: "+totalPrice2);
        }else {
            System.out.println();
        }

        if (count3>0){
            System.out.print("Item3: "+item3+" Price: "+totalPrice3);

        }else{
            System.out.println();
        }
        System.out.println();
        System.out.println("Total price: "+(totalPrice1+totalPrice2+totalPrice3));
    }

    public static class fff {
        public static void main(String[] args) {

            int itemPrice=54;
            int change=100-itemPrice; //75

            int quarter=change/25;
            int dimes=change%25/10;
            int nickels=((change%25%10))/5;



            System.out.println(quarter);
            System.out.println(dimes);
            System.out.println(nickels);
        }
    }

    public static class VendingMachine {
        public static void main(String[] args) {

            Scanner scan =new Scanner(System.in);
            System.out.println("Enter price in cents: ");
            int itemPrice=scan.nextInt();

            int change=100-itemPrice;

            int quarter=change/25;
            int dimes=change%25/10;
            int nickels=((change%25%10))/5;





            if (itemPrice<0 || itemPrice<=20 ||  itemPrice>100||itemPrice%5!=0){
                System.out.println("Invalid price");

            }else{
                System.out.println("Your change is " +quarter+ " quarters, "+dimes+" dimes, "+nickels+" nickels.");

            }


        }
    }
}
