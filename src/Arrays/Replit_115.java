package Arrays;
/*
Given an array num, get the max number in nums and print out to console.

nums → [2, 4, 2, 3, -2]) → 4
nums → [2, 2, 5, 3, 0 ]) → 5
nums → [1, 33, 5, 7, 9]) → 33

 */
public class Replit_115 {
    public static void main(String[] args) {

        int [] nums={1,5,-1,10,15,-500,-1000,5000};
        int max=0;
        for (int i=0;i<=nums.length-1;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
