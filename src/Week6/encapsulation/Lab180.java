package Week6.encapsulation;

public class Lab180 {
    public static void main(String[] args) {
        IciciBank anuradha=new IciciBank("Anuradha",23433);

        System.out.println(anuradha.getName());
        System.out.println(anuradha.getBalance());

        anuradha.setName("anu",false);
        System.out.println(anuradha.getName());

        anuradha.setBalance(20000,true);
        System.out.println(anuradha.getBalance());


    }




}
