package Week6.interfacepackage.carexample.example2;

public interface E {
    void startEngine();
    void stopEngine();

    default void haultingEngine(){
        System.out.println("Haulting the Engine");

    }

    static void m1(){
        System.out.println("M1");
    }

    // we can have default or static functions as complete functions in an interface
    // We can not have a normal functions as complete in an interface

//    void m2(){}  -We can not have a normal functions as complete
}
