package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar car = new ElectricCar();

        car.move();
        car.charge();

        gasCar.move();
        gasCar.fillUp();


    }
}
