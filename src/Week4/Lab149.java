package Week4;

import java.util.Arrays;

public class Lab149 {
    public static void main(String[] args) {
        //Single dimentional array

        int[] a={1,2,3,4};
        int[] e=new int[3];

        //2D array
        int[][] b={
                {1,2,3},
                {4,5,6},
                {6,7,8}};
        int[][] c=new int[3][3];
        c[0][0]=23;
        c[0][1]=23;
        c[0][2]=23;
        c[2][1]=23;
        c[2][2]=23;
        System.out.println(Arrays.toString(c));



        //3D Array
        int[][][] ab=new int[3][][];
        int[][][] ac= {
                {{2,3,4},{3,4,5}},
                {{2,5,7},{5,6,7}}
        };





    }
}
