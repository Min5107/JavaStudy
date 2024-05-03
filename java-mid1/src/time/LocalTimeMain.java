package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9,10,30);
        System.out.println(nowTime);
        System.out.println(ofTime);

        //계산(불변)
        ofTime = ofTime.plusMinutes(50);
        System.out.println(ofTime);
    }
}
