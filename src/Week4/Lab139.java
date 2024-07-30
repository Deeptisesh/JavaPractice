package Week4;

import java.util.Arrays;

public class Lab139 {
    public static void main(String[] args) {
        int[] marks=new int[3];

        // this array takes 0,1,2 index values
        // if we do not initialize for int it will be 0
        System.out.println(Arrays.toString(marks));

        marks[0]=78;
        marks[1]=88;
        marks[2]=98;
        System.out.println(Arrays.toString(marks));


    }
}
