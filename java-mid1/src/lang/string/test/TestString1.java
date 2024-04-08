package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        //startsWith() 를 사용해서 url 이 https:// 로 시작하는지 확인해라.
        String url = "https://www.example.com";

        System.out.println(url.startsWith("https"));

    }
}
