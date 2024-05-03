package time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now();// UTC 기준
        System.out.println(now);

        ZonedDateTime zdt = ZonedDateTime.now();
        //ZonedDateTime zdt = ZonedDateTime.of(2018,10,1,1,1,1,1, ZoneId.of("Asia/Seoul"));
        Instant from = Instant.from(zdt);
        System.out.println(from);

        Instant epochSecond = Instant.ofEpochSecond(10);
        System.out.println(epochSecond);

        //계산
        Instant later = epochSecond.plusSeconds(3600);
        System.out.println(later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println(laterEpochSecond);
    }
}
