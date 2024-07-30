package mypractice;

public class LeftTriangleStartPatternArrays {
    public static void main(String[] args) {
        /*
         *****

         ****

         ***

         **

         *
         */
        int[][] a=new int[5][5];

        for (int i = a.length-1; i >= 0; i--) {
            for (int j = a[i].length-1; j >= 0; j--) {
                if (j<=i) {
                    System.out.print("*");
                }

            }
            System.out.println();




        }


    }
}
