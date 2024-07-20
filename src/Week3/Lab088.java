package Week3;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //max num in 2 inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();

        System.out.println("enter num2");
        int num2=sc.nextInt();

        if (num1>num2)
            System.out.println(num1+" is maximum");
        else
            System.out.println(num2+" is maximum");

    }
}






