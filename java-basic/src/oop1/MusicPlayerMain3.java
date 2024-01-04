package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.playerCheck();
        //음악 플레이어 끄기
        player.off();
    }
}
