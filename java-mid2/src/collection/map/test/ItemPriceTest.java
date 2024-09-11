package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
//    다음 예제에서 Map 에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라
//    [망고, 딸기]
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
    // 코드 작성
        List<String> result = new ArrayList<>();
        for (String keys : map.keySet()) {
            if (map.get(keys) >= 1000){
                result.add(keys);
            }
        }
        System.out.println(result);

}
}
