package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        //음악 플레이어 켜기
        on(musicPlayerData);
        //볼륨 증가
        volumeUp(musicPlayerData);
        //볼륨 증가
        volumeUp(musicPlayerData);
        //볼륨 감소
        volumeDown(musicPlayerData);
        //음악 플레이어 상태
        playerCheck(musicPlayerData);
        //음악 플레이어 끄기
        off(musicPlayerData);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void playerCheck(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }



}
