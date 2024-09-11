package collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffle : " + list);
        Collections.sort(list);
        //list.sort(null);
        System.out.println("sort : " + list);
        Collections.reverse(list);
        System.out.println("reverse : " + list);
    }
}
