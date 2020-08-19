package Day21_Loops;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {

       String txt="mike_tyson@gmail.com";


       if(txt.contains("_")){
           System.out.println(txt.substring(txt.indexOf("_")+1,txt.indexOf("@"))+
                   "_"+txt.substring(0,txt.indexOf("_"))+
                   txt.substring(txt.indexOf("@")));
       }else{
           System.out.println(txt);
           }






    }

    public static class last3 {
        public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your number:");

            int num=scan.nextInt();

            int sum=0;

            while(num>0){
                sum+=num;
                num=scan.nextInt();

            }
            System.out.println("Total sum: "+sum);


            }


        }
}
