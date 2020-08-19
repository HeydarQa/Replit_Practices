package Day12_Switch;

import java.util.Scanner;

public class TimeToText {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds=input.nextInt();
        int hours=inputSeconds/3600;
        int minutes=(inputSeconds%3600)/60;
        int seconds=inputSeconds%3600%60;
        String time=hours+" hours, "+minutes+" minutes, and "+seconds+" seconds";

        System.out.println(time);
    }

}
