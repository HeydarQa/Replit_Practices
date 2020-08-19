package Day28_Methods;

public class Replit_184 {
    public static void main(String[] args) {
at3("longword","foo");
        System.out.println(at3("longword", "foo"));

    }


        public static String at3(String target, String word) {
        String newTxt = target.substring(0, 3) + word + target.substring(3, target.length() - 1);
        return newTxt;

    }
}


