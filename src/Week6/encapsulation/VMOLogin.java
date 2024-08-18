package Week6.encapsulation;

public class VMOLogin {

    private String username;
    protected String password;
    private String signInButton;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSignInButton() {
        return signInButton;
    }
}
