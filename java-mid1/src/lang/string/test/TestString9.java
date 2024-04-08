package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        //split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라
        String email = "hello@example.com";

        String[] emails = email.split("@");
        System.out.println("ID : " + emails[0]);
        System.out.println("Domain : " + emails[1]);





    }
}
