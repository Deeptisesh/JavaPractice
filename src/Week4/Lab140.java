package Week4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab140 {
    public static void main(String[] args) {
        int[] marks=new int[4];

        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        //marks[4]=sc.nextInt();

        System.out.println(Arrays.toString(marks));
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index value at " + i+" is "+marks[i]);

        }

    }
}
