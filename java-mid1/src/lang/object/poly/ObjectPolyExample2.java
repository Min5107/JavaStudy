package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object objcet = new Object(); // Object 인스턴스

        Object[] objects = {dog, car, objcet};

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }
}
