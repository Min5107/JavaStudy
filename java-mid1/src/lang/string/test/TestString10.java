package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        // split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
        String fruits = "apple,banana,mango";


        String[] fruit = fruits.split(",");
        for (String fruitss : fruit) {
            System.out.println(fruitss);
        }


        System.out.println(String.join(" -> ",fruit));





    }
}
