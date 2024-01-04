package class1.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        int totalAmout = 0;
        int amout = 0;
        for (ProductOrder productOrder : productOrders) {
            amout = productOrder.price * productOrder.quantity;
            System.out.println("상품명 : " + productOrder.productName + " 가격 : " + productOrder.price + " 수량 : " + productOrder.quantity + " 개별 가격 : " + amout);
            totalAmout += productOrder.price * productOrder.quantity;
            System.out.println("총가격 : " + totalAmout);
        }
    }
}
