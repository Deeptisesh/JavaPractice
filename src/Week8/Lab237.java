package Week8;

import java.util.Stack;

public class Lab237 {
    public static void main(String[] args) {
        // Stack- Legacy class - Not used in Automation - OLd class

        Stack<Object> s=new Stack<>();
                s.push("Pramod");
                s.push("Pradeep");
                s.push("{Pramila}");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
