package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        catHospital.setAnimal(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.setAnimal(cat); // 다른 타입 입력 : 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.setAnimal(dog);
        Animal animal = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println(animal);
    }
}
