package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest1 {

//    여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
//            30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다. 출력 순서는 관계없다.
//    출력 예): 30, 20, 10 또는 10, 20, 30 또는 20, 10, 30등과 같이 출력 순서는 관계 없다.

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        Set uniqueNames = new HashSet(List.of(inputArr));

//        for(Integer i : inputArr){
//            uniqueNames.add(i);
//        }

        System.out.println(uniqueNames);
    }

}
