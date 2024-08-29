package Week8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab236 {

    public static void main(String[] args) {
        LinkedList<String> n=new LinkedList<>();

        n.add("abc");
        n.add("awdx");
        n.add("hwec");
        n.add("here");

        System.out.println(n);

        ArrayList<String> a=new ArrayList<>();
        a.add("abc");
        a.add("awdx");
        a.add("hwec");
        a.add("here");
        System.out.println(a);

        // Both print same output , only difference is how they are stored and accessed

    }
}
