package poly.ex3;



public class AbstractMain {
    public static void main(String[] args) {
        // 추상클래스는 생성 불가

        AbstractAnimal[] animals = {new Cat(), new Dog(), new Caw()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }

        System.out.println();
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
