package Week7.wrapperclasses;

public class Lab197 {
    public static void main(String[] args) {
        String num="100";

        //int n=(int)num;
        Integer n=Integer.valueOf(num);
        System.out.println(n);
    // String to Primitive

        // wecannot do any math when value is store in String so we have to change it to int to perform math operations

        int a=Integer.parseInt(num);//
        System.out.println(a*3);

        String str="Deepti";

        //int a1=Integer.parseInt(str);// - Fails with exception-NumberFormatException

    }
}
