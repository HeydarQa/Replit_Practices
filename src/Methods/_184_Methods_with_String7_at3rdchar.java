package Methods;

/*
Instructions from your teacher:
at3 gets two strings and returns a string.

the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.

example use:

at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"

 */
public class _184_Methods_with_String7_at3rdchar {
    public static String at3(String target, String word) {
        //longwood  foo = longfoo wood
        String last1 = target.substring(0, 3) + word;
        return last1;
    }

    public static void main(String[] args) {
       String a="lawd";
       String b= "jjhhhhh";


       System.out.println(a.substring(0,3)+b+a.substring(3));

        //System.out.println(a.substring(3+b.length()));

        //System.out.println(a.length());
        //System.out.println(a.substring(2));
    }

}
