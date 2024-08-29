package Week7.staticandiibblocks;

public class Lab199 {
    public static void main(String[] args) {
        System.out.println(A.a);
        A.m1();
        A a1=new A();
        a1.m2();
        System.out.println(a1.dscount);


    }
}
class A{
    static int a=20;

    int dscount=100;
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("static Block");
    }

    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
