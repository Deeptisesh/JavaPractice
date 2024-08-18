package Week6.encapsulation;
// Fixed Encapsulation
public class Lab179 {
    // We can have only one public class
    public static void main(String[] args) {
        Login1 login=new Login1();
        // Now we will not be able to access password as it is a private variable


//        System.out.println(login.password);
//        login.password="123";
//        System.out.println(login.password);

        System.out.println(login.getUsername());
        login.setUsername("user",true);
        System.out.println(login.getUsername());

        login.setPassword("1234",true);
        System.out.println(login.getPassword());
    }
}
class Login1{
    // any number of classes we can have
// All Data members should be private and can only be accessible through a function(Getter/Setter Methods)
    public String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean ISADMIN) {
        if (ISADMIN) {
            this.password = password;
        } else
            System.out.println("Not Allowed");
    }

    public void setUsername(String username,boolean ISADMIN     ) {
        if (ISADMIN) {
            this.username = username;
        } else System.out.println("not allowed");
    }
    public void Login(String username, String password) {
        this.username = username;
        this.password = password;

    }
}
