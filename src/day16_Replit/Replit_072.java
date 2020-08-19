package day16_Replit;

import java.util.Scanner;

public class Replit_072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        String result=txt.substring(1,(txt.length()-1));
        System.out.println(result);

        System.out.println("--------------------------");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String neWord=word.substring(0,2);
        System.out.println(neWord);


    }
}
