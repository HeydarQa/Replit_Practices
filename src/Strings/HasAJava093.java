package Strings;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 */

import java.util.Scanner;

public class HasAJava093 {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
//c#javaruby
boolean result=(word.length()>1 && word.substring(0,4).equalsIgnoreCase("java")||word.length()>1 &&word.substring(1,5).equalsIgnoreCase("java"));

        System.out.println(result);



    }
}
