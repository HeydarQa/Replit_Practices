package it;

import java.util.Scanner;

public class Replit064 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();

       if(word.length()<5){
           System.out.println("Too short!");
       }else if (word.length()>5){
           System.out.println("Too long!");
       }else{
           for(int i=1;i<6;i++){
               System.out.print(""+word.charAt(word.length()-i));
           }
           //System.out.println(""+word.charAt(word.length()-1)+word.charAt(word.length()-2)+
                  // word.charAt(word.length()-3)+word.charAt(word.length()-4)+
                 //  word.charAt(word.length()-5) );
       }
        Scanner scan1 = new Scanner(System.in);
        String word1 = scan1.next();


    }
}
