package Strings;

import java.util.Scanner;

/*
System.out.println("First name: "+email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_")));
    System.out.println("Last name: "+email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));
    System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
    System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1));
 */
public class Without_X_x_079 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        }else if (word.substring(0,1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else if (word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else {
            System.out.println(word);
        }


    }
}
