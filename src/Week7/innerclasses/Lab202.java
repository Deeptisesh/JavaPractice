package Week7.innerclasses;

public class Lab202 {
    public static void main(String[] args) {


        Car c = new Car("lambo");
        c.drive();
        System.out.println(c.make);
// to access the inner class object
        Car.GearBox gb = c.new GearBox();
        gb.gear();

    }
}

class Car{

    String make;

    public Car(String make) {
        this.make = make;
    }
     void drive() {
        System.out.println("Drive Method of car class");
    }

    class GearBox{
        void gear(){
            System.out.println("Gear method of Gearbox class");
        }

        class NutBolts{
            void screw(){
                System.out.println("Screw method of Nutbolt class");
            }
        }
    }
}
