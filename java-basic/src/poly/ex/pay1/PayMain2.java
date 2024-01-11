package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("결제 수단을 입력하세요 : ");
            String payOption1 = scanner.nextLine();

            System.out.print("결제 금액을 입력하세요 : ");
            int amount1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("취소는 exit 입력");
            System.out.println();

            if(scanner.nextLine().equals("exit")){
                System.out.println("프로그램 종료");
                return;
            }

            payService.processPay(payOption1, amount1);
        }

    }
}
