package Week3;

public class Lab100 {
    public static void main(String[] args) {
        //switch never returns anything

        char code='A';
        int val= switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;

            default:
                throw new IllegalStateException("unexpected value"+code);
        };
        System.out.println(val);

    }
}
