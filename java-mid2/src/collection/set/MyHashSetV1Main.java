package collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);

        set.add(1); //O(1)
        set.add(2); //O(n)
        set.add(5); //O(n)
        set.add(8); //O(n)
        set.add(14); //O(n)
        set.add(99); //O(n)
        set.add(9); //O(n)

        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean contains = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + contains);

        //삭제

        boolean remove = set.remove(searchValue);
        System.out.println("remove = " + remove);
        System.out.println(set);

    }

}
