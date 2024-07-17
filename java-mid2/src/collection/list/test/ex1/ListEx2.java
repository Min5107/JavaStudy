package collection.list.test.ex1;


import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            int input = sc.nextInt();

            if(input == 0){
                break;
            }
            list.add(input);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i < list.size() - 1 ){
                System.out.print(", ");
            }
        }

    }

}
