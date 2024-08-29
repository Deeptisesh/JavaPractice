package Week6.abstraction.car;

public class Tesla extends Car {
   void drive(){
       openCar();
       start();
       gearBoxPart();
       stop();
       closeCar();
   }
}
