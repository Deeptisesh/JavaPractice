package Week3;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //take user input check even or odd

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        System.out.println(num);

        if(num%2==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
