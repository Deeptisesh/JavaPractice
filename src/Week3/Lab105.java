package Week3;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        //check if the char given is vowel ar not

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
