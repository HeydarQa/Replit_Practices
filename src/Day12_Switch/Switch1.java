package Day12_Switch;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int ValueofSum= num1+num2+num3;
        System.out.println("________________________________");
        int inputSeconds=3694;
        int hours=inputSeconds/3600;
        int minutes=inputSeconds%3600;
        System.out.println(hours);
        System.out.println(minutes);
    }
}
