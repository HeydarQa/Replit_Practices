package Day25;

import java.util.Scanner;

public class Replit_152 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {

            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    } //end main

        public static void plus_minus(int[] arr){

            int countPositive=0;
            int countNegative=0;
            int countZero=0;
        for (int i=0; i<=arr.length-1;i++){
            if (arr[i]<0){
                countNegative++;
            }else if (arr[i]>0){
                countPositive++;
            }else {
                countZero++;
            }
            }
            System.out.println("positives:"+countPositive+", negatives:"+countNegative+", zeros:"+countZero);

        }







}