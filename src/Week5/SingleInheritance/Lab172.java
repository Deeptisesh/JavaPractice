package Week5.SingleInheritance;

public class Lab172 {
    public static void main(String[] args) {
        Son s=new Son();

        s.BHK3();
        s.BHK2();// Son inherits father as the son extends Father class

        Father f=new Father();
        f.BHK2();
//        f.BHK3(); - father doesnot inherit son

        Father f1=new Son();
        f1.BHK2();
       // f1.BHK3(); - since the Father class doesnot know that son has BHK3
    }
}
