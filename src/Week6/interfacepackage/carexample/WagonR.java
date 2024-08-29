package Week6.interfacepackage.carexample;

public class WagonR implements Engine {

    void drive(){
        startEngine();
        stopEngine();
    }

    @Override
    public void startEngine() {
        System.out.println("Starting WagonR engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping WagonR engine");

    }
}
