package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013,11,21);
        System.out.println(nowDate);
        System.out.println(ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("10일뒤 : " + ofDate );
    }
}
