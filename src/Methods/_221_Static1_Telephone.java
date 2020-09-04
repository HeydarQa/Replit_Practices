package Methods;
/*
Instructions from your teacher:
Write the definition of a class Telephone.
The class has one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
 */
public class _221_Static1_Telephone {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Telephone1 telephone=new Telephone1();

        telephone.setNumber("12");
        telephone.getNumber();




    }
}



 class Telephone1 {

    String  number;

    public static int quantity=250;
    public static double total=15658.92;

    public String getNumber(){
      return number;
    }

    public void setNumber(String number){
        this.number=number;


    }


}

