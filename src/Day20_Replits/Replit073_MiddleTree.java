package Day20_Replits;
/*
If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid"
 */

import java.util.Scanner;

public class Replit073_MiddleTree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String txt=scan.next();
        int longText=txt.length();


        if(longText>=5&&longText%2!=0){
            System.out.println(txt.substring((longText / 2)-1,(longText/2)+2));

        }else {
            System.out.println("invalid");
        }


    }
}
