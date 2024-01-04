package ref.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = initProduct("두부", 2000, 2);
        orders[1] = initProduct("김치", 5000, 1);
        orders[2] = initProduct("콜라", 1500, 2);



        PrintProductOrder(orders);
//      getTotalOrder(orders);
    }

    public static ProductOrder initProduct(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    public static void PrintProductOrder(ProductOrder[] productOrders){
        int totalAmout = 0;
        for (ProductOrder productOrder : productOrders) {
            int amout = productOrder.price * productOrder.quantity;
            System.out.println("상품명 : " + productOrder.productName + " 가격 : " + productOrder.price + " 수량 : " + productOrder.quantity + " 개별 가격 : " + amout);
            totalAmout += productOrder.quantity * productOrder.price;
        }
        System.out.println("총가격 : " + totalAmout);
    }

//    public static void getTotalOrder(ProductOrder[] orders){
//        int totalAmout = 0;
//        for (ProductOrder order : orders) {
//            totalAmout += order.price * order.quantity;
//        }
//        System.out.println("총가격 : " + totalAmout);
//    }
}
