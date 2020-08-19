package Methods;

import java.util.ArrayList;
import java.util.Arrays;

/*
Instructions from your teacher:
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */
public class Methods_ArrayLIst_2Times_215 {
    public static void main(String[] args)
    {
ArrayList<Integer>ttt=new ArrayList<>();
ttt.addAll(Arrays.asList(1,1,3));
        System.out.println(twoTimes(ttt));
    }
    //create your method below

    public static ArrayList<Integer> twoTimes (ArrayList<Integer>old){
        ArrayList<Integer> twoT = new ArrayList<>();
        for (int i=0;i<=old.size()-1;i++){
            twoT.add(old.get(i));
            twoT.add(old.get(i));
        }
        return twoT;
    }
}
