package Day27_Methods;

public class MethodsWithString {
    public static void main(String[] args) {
        isError("error baku");
        System.out.println(isError("error bk"));
    }
    public static boolean isError(String line){

        if (line.substring(0,5).equals("error")){
            return true;

        }else {
            return false;
        }
    }
}
