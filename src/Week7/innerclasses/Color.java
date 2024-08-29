package Week7.innerclasses;

public enum Color {

    Red("#ff0000"),

    ;
    String hex;

    Color(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }
}
