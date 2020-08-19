package Arrays;

import sun.font.DelegatingShape;

import java.util.Scanner;

/*
Instructions from your teacher:
Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
public class PrintVowels_106 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        //a, e, i, o, u.

        String vowel="";
        for (int i=0;i<=word.length()-1;i++){
          if(word.charAt(i)=='a'){
              vowel+='a';
          }else if(word.charAt(i)=='e'){
              vowel+='e';
            }else if(word.charAt(i)=='e'){
              vowel+='i';
          }else if(word.charAt(i)=='o'){
              vowel+='o';
          }else if(word.charAt(i)=='u'){
              vowel+='u';
          }else if(word.charAt(i)=='i'){
              vowel+='i';
          }

        }


        System.out.println(vowel);
    }
}
