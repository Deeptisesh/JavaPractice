package Week3;

public class Lab124 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++) {
            if (i%2==0) {
                System.out.println("Even ->"+i);
                continue;
            }
            System.out.println("Odd ->" +i);
        }

    }
}
