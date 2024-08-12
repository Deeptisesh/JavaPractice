package Week5.Multilevelinheritance;

public class Lab174 {
    public static void main(String[] args) {
        Son child=new Son();

        child.home();// initally prefers from son ,if son doesnot have home methord then it will get from father, if father also donot have home then it will get from grand father

        


    }
}
