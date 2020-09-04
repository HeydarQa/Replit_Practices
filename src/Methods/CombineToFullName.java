package Methods;

/*
Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"Bulent","Ebrahim"}
last_names = {"Pola","Emam"}

returns a new String array with {"Bulent Pola",  "Ebrahim Emam"}
 */

public class CombineToFullName {
    public static String[] combineNames(String[] first_names, String[] last_names) {
        // write your codes here
        String[] fullName = new String[first_names.length+last_names.length];


        //first_names = {"Bulent","Ebrahim"}
        //last_names = {"Pola","Emam"}
        //{"Bulent Pola",  "Ebrahim Emam"}

        for (int i = 0; i <first_names.length ; i++) {  // Bulet ebrahim
            fullName[i]+=first_names[i]+" "+last_names[i];

        }
        return fullName;
    }




    public static void main(String[] args) {
        //feel free to test code here




    }
}

