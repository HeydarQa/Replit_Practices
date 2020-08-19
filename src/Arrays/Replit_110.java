package Arrays;
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
public class Replit_110 {
    public static void main(String[] args) {

        String[] words={"hello","why","by","apple","note"};
        String firs2="";

        for (String each:words){
            firs2=each.substring(0,1)+each.substring(each.length()-1);
            System.out.println(firs2);






        }





    }
}
