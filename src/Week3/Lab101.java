package Week3;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //ask for name, age and sal and print

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("enter your salary");
        float sal=sc.nextFloat();

        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);
    }
}
