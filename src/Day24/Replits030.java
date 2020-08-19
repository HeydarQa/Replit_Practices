package Day24;

import java.util.Scanner;

public class Replits030 {
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

        System.out.print("Item1: "+item1+" Price: "+totalPrice1+", ");


        if (count2>0){
            System.out.print("Item2: "+item2+" Price: "+totalPrice2);
        }else {
            System.out.print("Item3: "+item3+" Price: "+totalPrice3);

            }
        System.out.println();
        System.out.println("Total price: "+(totalPrice1+totalPrice2+totalPrice3));

    }
}
