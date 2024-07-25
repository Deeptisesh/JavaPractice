package Week3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        //Factorial
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number to print factorial");
        int n=sc.nextInt();

        int fact=1;

        for (int i=1;i<=n;i++){

            fact=fact*i;
        }
        System.out.println(fact);
    }
}
