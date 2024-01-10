package poly.ex6;

import poly.ex5.InterfaceAnimal;

public class SoundFlyMain {
    public static void main(String[] args) {

        AbstractAnimal[] animals = {new Dog(), new Bird(), new Chicken()};
        Fly[] flies = {new Bird(), new Chicken()};

        for (Fly fly : flies) {
            flyAnimal(fly);
        }
        System.out.println();
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();

    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
        System.out.println();
    }
}
