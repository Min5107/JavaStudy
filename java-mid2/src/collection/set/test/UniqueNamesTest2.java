package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
//    여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
//            30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
//    단 입력 순서대로 출력해라.
//    출력 예): 30, 20, 10

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

//        for (Integer integer : inputArr) {
//            set.add(integer);
//        }

        System.out.println("set = " + set);
    }
}
