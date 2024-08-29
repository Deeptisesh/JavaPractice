package Week6.abstraction.car;

abstract class Car extends Engine {

    //Engine,Gearbox,keys

    // Tesla is a type of car -drive()


    @Override
    void start() {
        System.out.println("Start");
    }

    @Override
    void stop() {
        System.out.println("Stop");

    }

    @Override
    void gearBoxPart() {
        System.out.println("GearBox Part");

    }

    @Override
    void openCar() {
        System.out.println("open car");

    }

    @Override
    void closeCar() {
        System.out.println("Close Car");

    }
}
