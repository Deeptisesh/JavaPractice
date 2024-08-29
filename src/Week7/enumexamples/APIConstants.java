package Week7.enumexamples;

public enum APIConstants {
    BaseURL("www.google.com"),
    LoginURL("www.google.com/Login"),
    RegisterURL("www.google.com/Register");



    private final String name;



    APIConstants(String name) {
        this.name=name;

    }

    public String getName() {
        return name;
    }
}
