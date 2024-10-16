import java.io.StringBufferInputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String test = "1sddsd";
        char a = 'd';
        int count = 0;
//        for (int i = 0; i < test.length(); i++) {
//            if (test.charAt(i) == a){
//                count++;
//            }
//        }

        for(char kk : test.toCharArray()){
            if(kk == a){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("test.indexOf(\"d\") = " + test.contains("D"));

        int check = test.indexOf("D") + 1;
        System.out.println(check);
    }
}