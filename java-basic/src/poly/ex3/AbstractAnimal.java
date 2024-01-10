package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();

    public void move(int value){
        System.out.println("동물이 움직입니다." + value);
    }
}
