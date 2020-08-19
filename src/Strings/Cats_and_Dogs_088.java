package Strings;

import java.util.Scanner;

/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */
public class Cats_and_Dogs_088 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        //dog-catthedog-cat

        while (word.contains("dog")) {
            countOfDogs++;
            word = word.replaceFirst("dog", " ");
        }
        while (word.contains("cat")) {
            countOfCats++;
            word = word.replaceFirst("cat", " ");

        }
        System.out.println(countOfCats==countOfDogs);

    }
}