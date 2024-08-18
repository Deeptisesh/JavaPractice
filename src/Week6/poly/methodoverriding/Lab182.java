package Week6.poly.methodoverriding;

public class Lab182 {

    // method overriding
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.Bark();

        Dog d1=new Dog();
        d1.Bark();

        Dog dog_ref=new Hound();
        dog_ref.Bark();
    }
}
