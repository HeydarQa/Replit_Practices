package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Replit_199 {
    public static void main(String[] args) {

        String str = "AACCDERRRTAAM";

        String unique="";

        ArrayList<String> list=new ArrayList<>();
        for( String each:str.split("") ){
            list.add(each);
        }

        for (String each:list){
            int count = Collections.frequency(list,each);
            if(count==1){
                unique+=each;
            }

        }
        System.out.println(unique);
    }

}

