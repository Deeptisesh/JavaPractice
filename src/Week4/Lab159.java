package Week4;

public class Lab159 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.name = "SBI";
        bank2.name = "ICICI";
        bank1.accno=12345678;

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank2.balance);
        System.out.println(bank2.accno);
        System.out.println(bank1.accno);

        bank2.balance = 100;
        System.out.println(bank2.balance);
        System.out.println(bank1.balance);

    }
}
