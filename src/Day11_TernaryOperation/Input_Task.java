package Day11_TernaryOperation;


import java.util.Scanner;

public class Input_Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        double num = input.nextDouble();

        System.out.println("Enter your 2nd num: ");
        double num1 = input.nextDouble();


        int vehicleYear = 10;

        //WRITE YOUR CODE HERE:
        String result = "";
        if (vehicleYear >= 1995 && vehicleYear <= 1998) {
            result = "Your vehicle needs to be recalled!";
        } else if (vehicleYear == 2001 || vehicleYear == 2002) {
            result = "Your vehicle needs to be recalled!";
        } else if (vehicleYear >= 2004 && vehicleYear <= 2006) {
            result = "Your vehicle needs to be recalled!";
        } else if (vehicleYear >= 2015 && vehicleYear <= 2017){
        result = "Your vehicle needs to be recalled!";
        }else{
        result = "Your vehicle is fine, enjoy!";
    }
        System.out.println(result);

}
}






