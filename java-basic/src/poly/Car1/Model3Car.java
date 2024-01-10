package poly.Car1;

public class Model3Car implements Car{



    @Override
    public String carName(){
        return "Model3";
    }
    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
    public void int1() {
        System.out.println("hello");
    }
}
