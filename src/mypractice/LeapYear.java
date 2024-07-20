package mypractice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Year");
        int year=sc.nextInt();
        boolean x=false;

       if(year%4==0 ||year%400==0){
           x=true;
       }

        if(x==true){
            System.out.println("leap Year");
        }else
            System.out.println("Not a leap Year");

    }
}
