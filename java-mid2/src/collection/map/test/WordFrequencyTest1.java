package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        //{orange=1, banana=2, apple=3}
        //각각의 단어가 나타난 수를 출력해라.

        String text = "orange banana apple apple banana apple";
        // 코드 작성
        HashMap<String , Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for(String word : words) {
            System.out.println(word);
            Integer count = map.get(word);

            System.out.println(count);
            if(count == null){
                count = 0;
            }
            count++;
            map.put(word, count);
        }
        System.out.println(map);
    }
}
