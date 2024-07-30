package Week4;

import java.util.Arrays;

public class Lab143 {
    public static void main(String[] args) {
        final int[] ages=new int[4];
        ages[2]=76;
        // Here we are able to change the value because the final is for the length of the array and not for the values in it

        System.out.println(Arrays.toString(ages));
        ages[1]=98;
        System.out.println(Arrays.toString(ages));

    }
}
