package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    // map1 과 map2 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);
        // 코드 작성
        Map<String, Integer> result = new HashMap<>();
        int sum = 0;

        for (String keys : map2.keySet()) {
            if(map1.containsKey(keys)){
                sum += map1.get(keys) + map2.get(keys);
                result.put(keys, map1.get(keys) + map2.get(keys));
            }

        }
        System.out.println(sum);
        System.out.println(result);
    }
}
