package Week3;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine if the triangle is
        //equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1 value");
        int s1= sc.nextInt();
        System.out.println("Enter the side1 value");
        int s2=sc.nextInt();
        System.out.println("Enter the side1 value");
        int s3=sc.nextInt();
        if(s1==s2 && s2==s3){
            System.out.println("Equilateral");
        } else if (s1==s2 || s2==s3 ||s1==s3) {
            System.out.println("isosceles");
            
        } else {
            System.out.println("scalene");
        }


    }
}
