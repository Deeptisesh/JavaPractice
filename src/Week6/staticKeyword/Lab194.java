package Week6.staticKeyword;

public class Lab194 {

    // Static Block
    public static void main(String[] args) {
        System.out.println(ATB.coursename);

        ATB1 atb=new ATB1("Deepti");

        System.out.println(atb.getName());

    }
}
 class ATB1{
// we can write a block directly has {}.
     {
         // this is the static block where we can write code which need to be executed before running this class.
         // it is executed as soon as we create a object of this class
         // we can write code like starting a website here for webAutomation

         System.out.println("This is IIB ");
         System.out.println("Reading from CSV file");
     }
     // Static Block - This block executes even before IIB.

     static {
         System.out.println("This is the Static Block");
     }

     private String name;
     static String coursename="ATB Course";


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }



     public ATB1(String name) {
         this.name = name;
     }

     static void assignment(){
         System.out.println("Do assignment");
     }
 }