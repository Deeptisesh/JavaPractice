package Week3;

import java.util.Scanner;

public class Lab104
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your num1");
        int num1=sc.nextInt();
        System.out.println("enter your num2");
        int num2=sc.nextInt();
        System.out.println("enter your num3");
        int num3=sc.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("num1 is max");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is max");

        }else
            System.out.println("num3 is max");

    }
}
