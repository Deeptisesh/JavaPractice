package Week4;

import java.util.Arrays;
import java.util.Scanner;

public class Lab148 {
    public static void main(String[] args) {
        // find the maximum in a array

        int[] num = new int[5];
        int max = 1;


        Scanner sc = new Scanner(System.in);

        int min = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            System.out.println(num[i]);
            min = num[0];
            if (num[i] < min) {
                min = num[i];
                //System.out.println("max at index"+i+"is"+max);

            }


            if (num[i] > max) {
                max = num[i];
                //System.out.println("max at index"+i+"is"+max);

            }


        }
        System.out.println(Arrays.toString(num));
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);


    }
}
