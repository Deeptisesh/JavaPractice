package Week7.innerclasses;

public class Lab203 {
    public static void main(String[] args) {
        // We cannot create a object of interface but a class can be created from that interface

        A a=new A() {
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");

            }

            @Override
            public void m3() {
                System.out.println("m3");

            }
        };
        a.m1();
        a.m2();
        a.m3();
    }
}

interface A{
    void m1();
    void m2();
    void m3();

}
