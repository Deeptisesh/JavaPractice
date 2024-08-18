package Week6.encapsulation;

public class Lab178 {
    // We can have only one public class
    public static void main(String[] args) {
        Login login=new Login("admin","admin");


        System.out.println(login.password);
        login.password="123";
        System.out.println(login.password);

        // No security as everyone can change the password
    }
}
class Login{
    // any number of classes we can have

    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
class  Register{

}
