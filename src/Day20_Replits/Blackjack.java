package Day20_Replits;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int house= scan.nextInt();
        int player=scan.nextInt();
        String result =" ";


        if (player>=21){
            result="bust";


        } else if (player < house) {
            result="player loss";

        }else if (player==house){
            result="it is a tie";
        }else{
            result="player win";
        }
        System.out.println(result);
    }
}
