package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스는 추상이라 생성 불가
        // InterfaceAnimal interfaceAnimal = new InterfaceAnimal()

        InterfaceAnimal[] animals = {new Cat(), new Dog(), new Caw()};
        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }

    private static void moveAnimal(InterfaceAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
        System.out.println();
    }
}
