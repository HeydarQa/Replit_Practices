package Arrays;

import java.util.Scanner;

/*
        if (word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        }else if (word.substring(0).equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else if (word.substring(word.length()-1).equalsIgnoreCase("x")){
            System.out.println(word.substring(0,word.length()-1));
        }else {
            System.out.println(word);
        }
 */
public class CountJava_097 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int count = 0;
        for (int i=0;i<=word.length()-4;i++){
            if(word.substring(i,i+4).equals("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}