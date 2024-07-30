package Week4;

public class Lab151 {
    public static void main(String[] args) {
        int[][] array_2d={
                {34,56,78},
                {43,87,97},
                {23,53,90}
        };

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");

            }
            System.out.println();

        }
    }
}
