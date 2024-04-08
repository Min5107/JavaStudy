package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        //str 에는 파일의 이름과 확장자가 주어진다. ext 에는 파일의 확장자가 주어진다.
        //파일명과 확장자를 분리해서 출력하라.
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);

        String start = str.substring(0,extIndex);
        String end = str.substring(extIndex);

        System.out.println(start);
        System.out.println(end);




    }
}
