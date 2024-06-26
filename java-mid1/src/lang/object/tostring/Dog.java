package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }
}
