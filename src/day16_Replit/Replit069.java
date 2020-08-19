package day16_Replit;

import java.util.Scanner;

public class Replit069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        //Azerb aycan
        int half=word.length()/2;
        String neWord=word.substring(0,half)+word.substring(0,half);
        System.out.println(neWord);
    }
}
