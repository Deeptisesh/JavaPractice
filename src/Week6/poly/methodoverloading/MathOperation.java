package Week6.poly.methodoverloading;

public class MathOperation {

   public int add(int a,int b){
       return a+b;

    }
    public String add(String a,String b){
        return a+b;

    }
    public double add(double a,double b){
        return a+b;

    }
    public String add(String a,int b){
        return a+b;

    }


}
