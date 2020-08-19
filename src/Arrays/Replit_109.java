package Arrays;

import java.util.Scanner;

/*
Instructions from your teacher:
The code provided in your main method will take in five Strings and save them into an array called arr.  Print out the first three letters of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
 */
public class Replit_109 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }

        String firs3="";
        for (String each:arr){
            firs3=each.substring(0,3);
            System.out.println(firs3);

        }



    }
}
