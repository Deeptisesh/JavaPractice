package Week3;

import java.util.Scanner;

public class Lab090
{
    public static void main(String[] args) {
        //Grade Calculator

        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the %");
        int percentage=sc.nextInt();

        char Grade='F';

        if(percentage>90 && percentage<=100){
            Grade='A';
        } else if (percentage>80 && percentage<=90) {
            Grade='B';
        }else if (percentage>70 && percentage<=80) {
            Grade='C';
        }else if (percentage>60 && percentage<=70) {
            Grade='D';
        }else {
            Grade='F';
        }
        System.out.println("Your Grade is : "+ Grade);


    }
}
