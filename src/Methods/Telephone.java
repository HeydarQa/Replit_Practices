package Methods;
/*
Write the definition of a class Telephone.
The class has one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.

 */
public class Telephone {
    String number;

    public static int quantity=250;
    public static double total=15658.92;

    public void setNumber(String number){
        this.number=number;
    }

    public String getNumber(){
        return number;
    }




}
