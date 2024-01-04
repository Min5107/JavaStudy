package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[n];

        inputOrders(scanner, orders);
        PrintProductOrder(orders);
    }

    public static void inputOrders(Scanner scanner, ProductOrder[] productOrder){
        for (int i = 0; i < productOrder.length; i++){
            System.out.println((i + 1) + "번째 주문입니다.");

            System.out.print("상품명을 입력해주세요 : ");
            String productName = scanner.nextLine();

            System.out.print("가격을 입력해주세요 : ");
            int productPrice = scanner.nextInt();

            System.out.print("수량을 입력해주세요 : ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine();

            System.out.println("");

            productOrder[i] = initProduct(productName, productPrice, productQuantity);
        }
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

}
