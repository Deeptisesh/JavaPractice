package Week4;

public class Lab150 {
    public static void main(String[] args) {
        //2D Array
        
        int[][] a={
                {2,3,4},
                {5,6,7},
                {7,8,9}
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                
            }
            System.out.println();
            
        }
    }
}
