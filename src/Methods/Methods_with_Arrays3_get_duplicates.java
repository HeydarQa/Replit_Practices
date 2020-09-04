package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Instructions from your teacher:
getDup accepts an array and returns an int.

If there is any element is duplicated, method counts how many of those present in the array.
For example :

getDup(["1","2","aa"',"1"])
returns:2 ("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","2","aa"',"1", "aa"])
returns:4 ("1" is duplicated and there are two "1"s
           and 2 "aa"s so return is 4)


getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3

hint:

you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current
 */
public class Methods_with_Arrays3_get_duplicates {
    public static int getDup(String[] r){
// 1 a 1 aa 5 cv a
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(r));

        list.removeIf(p-> Collections.frequency(list,p)==1);
        return list.size();
        /*
        int count=0;
        for (int i=0;i<=list.size()-1;i++){
            if(i+1<list.size() &&list.get(i).equals(list.get(i+1))){
                count++;
*/

            }

    public static void main(String[] args) {
        String[]r={"a","1","aa","1","aa"};
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(r));

        list.removeIf(p-> Collections.frequency(list,p)==1);

        System.out.println(list.size());
    }
        }







