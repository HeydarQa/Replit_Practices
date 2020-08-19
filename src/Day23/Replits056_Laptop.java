package Day23;

import java.util.Scanner;

public class Replits056_Laptop {
    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size: ");
        double screenSize=scan.nextDouble();

        if (screenSize==13.3) {
            price += 200;
        }else if (screenSize==15) {
            price += 300;
        }else{
             price+=400;
                }
        System.out.println("Select CPU type: ");
        cpu=scan.next();
        switch (cpu){
            case "i3":
                price+=150;
            case "i5":
                price+=250;
            case "i7":
                price+=350;
            default:

        }
        System.out.println("Select RAM size: ");
        ram=scan.nextInt();

        price+=(ram/4*50);
        System.out.println(price);

        System.out.println("Select storage type: ");
        storageType=scan.next();

        System.out.println("Enter memory size: ");
        //int memorySize



    }
}
