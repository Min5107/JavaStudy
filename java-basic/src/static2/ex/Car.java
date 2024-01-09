package static2.ex;

public class Car {
    private String car;
    private static int buyCar;

    Car (String car){
        this.car = car;
        buyCar++;
        System.out.println("차량 구입, 이름 : " + car);
    }

    static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + buyCar);
    }
}
