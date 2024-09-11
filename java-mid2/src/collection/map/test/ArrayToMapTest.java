package collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA",
                "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        HashMap<String, Integer> map = new HashMap<>();

//        for(int i = 0; i < productArr.length; i++){
//            map.put(productArr[i][0], productArr[i][1]);
//        }
        for (String[] insert : productArr ) {
            map.put(insert[0], Integer.valueOf(insert[1]));
        }
        for (String key : map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));

        }

        // Map의 모든 데이터 출력 - 코드 작성


    }
}
