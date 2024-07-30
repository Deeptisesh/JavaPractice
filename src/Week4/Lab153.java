package Week4;

public class Lab153 {
    public static void main(String[] args) {
        // Since Strings are immutable they are generally not preferred in Automation
        // Hence we have  String Builder and String Buffer classes

        String s="Deepti";

        StringBuffer buffer=new StringBuffer("Deepti");
        buffer.append("Seshu");
        System.out.println(buffer.length());
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("Chaitanya");
        builder.append("Rama");

        System.out.println(builder.length());
        System.out.println(builder);
    }
}
