package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price){
        int discount = 0;

        if (classGrade == ClassGrade.BASIC) {
            discount = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discount = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discount = 30;
        } else {
            System.out.println("할인X");
        }


        return price * discount / 100;
    }
}
