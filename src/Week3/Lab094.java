package Week3;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
//switch vowels

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);

        switch (ch){
            case 'A':
                System.out.println("Character is "+ch);
                break;
            case 'B':
                System.out.println("Character is "+ch);
                break;
            case 'C':
                System.out.println("Character is "+ch);
                break;


        }
    }
}
