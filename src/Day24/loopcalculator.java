package Day24;

import java.util.Scanner;

public class loopcalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;  // 1+2+3
        for(int i=1;i<=n;n--){  //
            sum+=n;
        }


        System.out.println(sum);



    }
}
