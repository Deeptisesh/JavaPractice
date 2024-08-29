package Week6.superthiskeyword;

public class Lab183 {
    public static void main(String[] args) {
        car s=new car();

        s.display();

    }
}


class car extends vehicle{

    private int max_speed=280;

    public car() {
        super();
        System.out.println("DC of Car");

    }

    @Override
    public void display(){
        System.out.println("Car Max speed is "+ this.max_speed);
        System.out.println("Vehicle Max speed is "+ super.max_speed);
        super.display();
    }
}


class vehicle{
    public int max_speed=180;

    public vehicle() {
        System.out.println("DC of Vehicle");
    }

    void display(){
        System.out.println("The display speed");
    }

}
