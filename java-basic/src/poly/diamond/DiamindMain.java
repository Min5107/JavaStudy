package poly.diamond;

public class DiamindMain {
    public static void main(String[] args) {
        Child child = new Child();
        InterfaceA interfaceA = new Child();
        InterfaceB interfaceB = new Child();


        System.out.println("Child");
        child.MethodCommon();
        child.MethodA();
        child.MethodB();

        System.out.println("InterfaceA");
        interfaceA.MethodA();
        interfaceA.MethodCommon();

        System.out.println("InterfaceB");
        interfaceB.MethodB();
        interfaceB.MethodCommon();
    }
}
