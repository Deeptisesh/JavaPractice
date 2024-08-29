package Week6.superthiskeyword;

public class Lab185 {


}
class Person1{


    public Person1() {
        System.out.println("constructor of person with no parameter-DC");
    }
    public Person1(String a) {
        System.out.println("constructor of person with one parameter-PC");
    }
    public Person1(String a,int b) {
        System.out.println("constructor of person with 2 parameter-PC");
    }
}

class Student1 extends Person1{
    int a = 10;
    public Student1() {


        super();
        System.out.println("constructor of Student1 with no parameter-DC");
        System.out.println(this.a);
    }
}
