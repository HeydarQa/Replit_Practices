package Strings;

import java.util.Scanner;

/*
Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
Example:
input: A
input: Z
output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

Example:
input: a
input: f
output: abcdef

Example:
input: a
input: d
output: abcd

Example:
input: B
input: O
output: BCDEFGHIJKLMNO
 */
public class PrintLetters_095 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);


        for (int i = start; i <= end; i++) {
           char ch=(char)i;

            System.out.print(ch);
            System.out.println("Today Word-Of-The-Day is:java");
        }


    }
}
