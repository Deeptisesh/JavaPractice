package Week3;

public class Lab132 {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            System.out.println("While"+i);
            i++;
        }
        do {
            System.out.println("doWhile"+i);
            i++;
        }
        while (i<=10);
    }
}
