package ArrayList;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
public class Arrays_Find_Non_Duplicat_122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        //1 2 3 2 3

        for (int j = 0; j <= nums.length - 1; j++) {

            int num1 = nums[j];
            int count = 0;
            for (int i = 0; i <= nums.length - 1; i++) {
                int each = nums[i];
                if (each==num1) {
                    count++;

                }
            }
            if (count==1){
                System.out.println(num1);
            }
        }

    }
}
