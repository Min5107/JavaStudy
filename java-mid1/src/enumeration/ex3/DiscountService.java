package enumeration.ex3;

public class DiscountService {
    public int discount(Grade classGrade, int price){
        int discount = 0;

        if (classGrade == Grade.BASIC) {
            discount = 10;
        } else if (classGrade == Grade.GOLD) {
            discount = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discount = 30;
        } else {
            System.out.println("할인X");
        }


        return price * discount / 100;
    }
}
