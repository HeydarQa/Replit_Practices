package day16_Replit;

import java.util.Scanner;

public class Replit_String_IndexOf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        String txt= " foo bar";
        int text = txt.indexOf("f");
        System.out.println(text);
        System.out.println("======================");
        String a="Hello  if you like my leeter plse let me know";
        if(a.contains("alex")){
            System.out.println("read mail");
        }else{
            System.out.println("dont read");
        }


    }
}
