package Week4;

public class Lab152 {
    public static void main(String[] args) {
        String s=new String("Deepti");// Stored in Heap Memory
        String s1="Deepti1";// Stored in String Constant Pool
        // Strings are Immutable
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    }
}
