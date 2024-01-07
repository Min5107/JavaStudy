package static1;



public class DataCountMain1 {
    public static void main(String[] args) {
        // Static 연습
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + Data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + Data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + Data1.count);
    }
}
