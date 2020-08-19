package Day23;

import java.util.Scanner;

public class LoopCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;


        for(int i=n;i>=1; i--){
          sum *= n;
          n--;

        }

        System.out.println(sum);

    }
}
