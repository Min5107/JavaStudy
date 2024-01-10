package poly.Car1;



public class CarMain1 {
    public static void main(String[] args) {

        Driver driver = new Driver();

        // K3 자동차로 설정
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        System.out.println();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();


    }
}
