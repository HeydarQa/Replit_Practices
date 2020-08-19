package it;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

     if(word.length()%2!=0) {
         if (word.length() >= 3) {
             System.out.println("" + word.charAt(word.length() / 2));
         }else if(word.length()==1) {
             System.out.println(word.substring(0) + word.substring(0) + word.substring(0));
         }

     } else if(word.length()%2==0){
         if (word.length()>=4){
             System.out.println("" + word.charAt(word.length() /3)+word.charAt(word.length() /2));
         }else if (word.length()==2)  {
             System.out.println(word+word);

             
         }

     }


     }

     }


