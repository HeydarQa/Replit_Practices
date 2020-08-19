package Arrays;
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:
invalid email

email -> my@fancy@email.com
print:
invalid email
 */

import sun.jvm.hotspot.memory.PlaceholderEntry;

import javax.swing.plaf.IconUIResource;
import java.net.ServerSocket;
import java.util.Scanner;

public class Arrays_SplitEmail_119 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int count = 0;

        for (int i = 0; i <= email.length() - 1; i++) {
            if (email.charAt(i) == '@') {
                count++;
            }
        }
        if (count >= 2 || count == 0) {
            System.out.println("invalid email");

        } else {
            System.out.println("Email id: " + email.substring(0, email.indexOf("@")));
            System.out.println("Email domain: " + email.substring(email.indexOf("@") + 1));
        }
    }
}

