package Week7.wrapperclasses;

public class Lab196 {
    public static void main(String[] args) {
        // primitive to Wrapper

        int a=10;// Primitive data type

        Integer b=a;// assigning "a" to wrapper class
        // Now we will have access to various functions as b is an object

        System.out.println(a);// we will not be able to do anything other than printing value

        System.out.println(b.compareTo(15));
        System.out.println(b.floatValue());

        // Wrapper to Primitive

        Integer a1=20;//Auto Boxing: int(20) is automatically converted to Integer class object

        int a2=a1;// UnBoxing: un wrapping the int

        System.out.println(a1.byteValue());// a1 will have functions as it is an object
        System.out.println(a2);// A2 is primitive data type hence no functions
    }
}
