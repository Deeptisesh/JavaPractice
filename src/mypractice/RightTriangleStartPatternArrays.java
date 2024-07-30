package mypractice;

public interface RightTriangleStartPatternArrays {
    public static void main(String[] args) {
        /*
         *

         **

         ***

         ****

         *****
         */

        int[][] a = new int[5][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j <= i) {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
