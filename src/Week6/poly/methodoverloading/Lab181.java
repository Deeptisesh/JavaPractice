package Week6.poly.methodoverloading;

public class Lab181 {
    //poly
    //

    public static void main(String[] args) {
        MathOperation mathop=new MathOperation();
        int addresult=mathop.add(2,4);
        System.out.println(addresult);
        double addresult1=mathop.add(2.6,4.7);
        System.out.println(addresult1);
        String addresult3=mathop.add("Deepti","Seshu");
        System.out.println(addresult3);
        String addresult4=mathop.add("Deepti",4);
        System.out.println(addresult4);
    }

}
