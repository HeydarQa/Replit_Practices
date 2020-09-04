package Methods;

import java.util.Arrays;

/*
Instructions from your teacher:
Switch the last element in an array with the first and return the array.

example:

do_switch([1,2,3,4])
returns:[[4,2,3,1]

do_switch([7,2,3,5])
returns:[5,2,3,7]

 */
public class Switch {
    public static int[] do_switch(int[] i)
    {
        int temp=i[0];
        i[0]=i[i.length-1];
        i[i.length-1]=temp;
        return i;
    }


    //return={21,22,23};
    /*
    public static int[] do_switch(int[] i) {
       int [] returns= new int[3];


        return;
    }

*/
    public static void main(String[] args) {
        int []i={1,2,3,4 ,5,6};
        System.out.println(Arrays.toString(do_switch(i)));

/*



        int[] do_switch = {11, 12, 13, 14};
        //returns       // 14  13 12 11

        int[] returns = new int[do_switch.length];

        int x = do_switch.length;

        for (int i = 0; i < do_switch.length; i++) {
            returns[i] = do_switch[x - 1]; //
            x--;

        }
    /*




            returns[0]=do_switch[do_switch.length-1]; // 3 index
            returns[1]=do_switch[2];
            returns[2]=do_switch[1];
            returns[3]=do_switch[0];
*/



    }
}
