package day16_Replit;

import com.sun.deploy.security.SelectableSecurityManager;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Replit_059 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String name= scan.nextLine();
        scan.close();



        if(name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake")){
            System.out.println(name);
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
            System.out.println(name);
        }


    }
}

