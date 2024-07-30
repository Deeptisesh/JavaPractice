package Week4;

import java.util.Scanner;

public class Lab147 {
    public static void main(String[] args) {
        //user input for5 subject marks and find average of it

        float[] marks=new float[5];
        Scanner sc=new Scanner(System.in);
        float avg=0;

        marks[0]= sc.nextFloat();
        marks[1]= sc.nextFloat();
        marks[2]= sc.nextFloat();
        marks[3]= sc.nextFloat();
        marks[4]= sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            avg=(marks[i]+avg);

        }
        avg=(avg)/ marks.length;
        System.out.println("Average is : "+avg);
        sc.close();
    }
}
