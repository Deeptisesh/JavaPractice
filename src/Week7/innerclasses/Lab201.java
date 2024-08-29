package Week7.innerclasses;

public class Lab201 {
    public static void main(String[] args) {
        Oc o=new Oc();
        o.m1();




    }
}

class Oc{

    Integer a=120;
    void m1(){
        System.out.println("Outer class m1 method");
//        System.out.println(b);// outer class cannot access inner class variables
    }

    class Ic{

        void m2(){
            Integer b=100;

            // inner classes can access the outer class instance variables
            System.out.println("inner class m2 method");
            System.out.println(a);
        }

    }

}
