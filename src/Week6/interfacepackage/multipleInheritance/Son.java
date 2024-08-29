package Week6.interfacepackage.multipleInheritance;

public class Son implements Mother,Father{
    @Override
    public void home() {


    }

    @Override
    public void money() {
        System.out.println("Since its not complete function,son has to complete it hence it can be only one method used as multiple inheritance");

    }
}
