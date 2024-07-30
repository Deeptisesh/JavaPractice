package mypractice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestSalaryArray {
    public static void main(String[] args) {
        int[] salaries = new int[5];
        int max = 1;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Enter the salary" + (i + 1));
            salaries[i] = sc.nextInt();
        }
            //Sort
            Arrays.sort(salaries);
            // Highest salary
            System.out.println("Highest Salary is " + salaries[salaries.length-1]);
            // Second Highest salary
            System.out.println("Second Highest salary is: " + salaries[salaries.length - 2]);





            System.out.println(Arrays.toString(salaries));



        }


    }


