package Week6.staticKeyword;

public class Lab193 {

    //A function or variable or class can be Static
    public static void main(String[] args) {

        System.out.println(ATB.coursename);
        ATB.assignment();// Static variables or me

        ATB atb=new ATB("amit");

        System.out.println(atb.getName());
    }


}

 class ATB{
    private String name;
    static String coursename="ATB Course";


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }



       public ATB(String name) {
         this.name = name;
     }

     static void assignment(){
         System.out.println("Do assignment");
     }
 }