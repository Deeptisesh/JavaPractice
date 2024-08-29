package Week6.superthiskeyword;

public class Lab184 {
    public static void main(String[] args) {

    }
}

class student extends Person{
    @Override
    void message() {
        System.out.println("I am a Student message ");
    }
    void display(){
        super.message();
    }
}

class Person{
    void message(){
        System.out.println("I am a person message");
    }
}
