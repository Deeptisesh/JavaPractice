package Week6.encapsulation;

public class IciciBank {

    //Attributes should be private and Methods with getters and setter should be public

    private String name;
    private long balance;

    public IciciBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,Boolean IsAdmin) {
        if (IsAdmin) {
            this.name = name;
        }else {
            System.out.println("Not allowed");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance,Boolean IsAdmin) {
        if (IsAdmin) {
            this.balance = balance;
        }else {
            System.out.println("Not allowed");
        }
    }
}
