package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Object> List1 = new ArrayList<>();
        List<Object> List2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList(); // 자바5 부터 도입
        List<Object> list4 = List.of(); // 자바9 부터 도입

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());



        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);

        // ListOf 복사후 List 생성
        // asList 기존 복사하는 원래값의 참조값을 가져와 사용

//        List<Integer> list5 = Arrays.asList(arr);
//        List<Integer> list6 = List.of(arr);


    }
}
