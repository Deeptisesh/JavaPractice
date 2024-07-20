package Week3;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //check num is positive or negitive

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();

        if (num<0){
            System.out.println("negetive");
        }else if (num>0){
            System.out.println("positive");
        }else
            System.out.println("0");
    }
}
