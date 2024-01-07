package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item){
        if (checkItems()){

            System.out.println("장바구니 아이템이 10개를 초과하였습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;

        }

    }
    private boolean checkItems(){
        return itemCount > 10;
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + " 합계 : " + item.totalPrice());
        }
        System.out.println("총가격 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.totalPrice();
        }

        return totalPrice;
    }
}
