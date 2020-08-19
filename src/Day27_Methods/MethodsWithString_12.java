package Day27_Methods;

public class MethodsWithString_12 {
    public static void main(String[] args) {

        System.out.println(extractNum("78@#$*049"));
    }


    public static String extractNum(String s) {

        String result = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                result += s.charAt(i);

            }
        }
        return result;
    }
}
