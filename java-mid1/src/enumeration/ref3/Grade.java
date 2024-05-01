package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);
    private final int discountPercentage;

    Grade(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    //추가
    public int discount(int price){
    return price * discountPercentage / 100;
    }
}
