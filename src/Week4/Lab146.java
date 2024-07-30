package Week4;

import java.util.Arrays;

public class Lab146 {
    public static void main(String[] args) {
        //we can initialise the String[] args of main class by clicking :(3dots ) and click edit to Run and debug configurations and add in the Program Arguments

        System.out.println(Arrays.toString(args));
        System.out.println(args[0]);
        System.out.println(args[1]);

        if(args.length>0){
            System.out.println(args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }else
            System.out.println("No Arguments given");
    }
}
