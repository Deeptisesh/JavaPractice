package Week4;

public class Lab156 {
    public static void main(String[] args) {
        BuildingBlueprint BBP=new BuildingBlueprint();

        BBP.color="Red";
        BBP.address="123 hanking";

        BBP.useLift();

        BuildingBlueprint DLF=new BuildingBlueprint();

        DLF.color="Red";
        DLF.address="123 hanking";

        DLF.useLift();
        DLF.activities();
    }
}
