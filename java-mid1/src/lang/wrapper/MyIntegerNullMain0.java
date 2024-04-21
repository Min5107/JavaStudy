package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1,0,1,2,3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); //-1
    }

    private static int findValue(int[] intArr, int value) {
        for (int i : intArr) {
            if (i == value) {
                return value;
            }
        }
        return -1;
    }
}
