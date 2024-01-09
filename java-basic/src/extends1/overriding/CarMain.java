package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar car = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        car.move();
        car.charge();
        car.openDoor();

        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
        
    }
}
