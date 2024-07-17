package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            int input = sc.nextInt();

            if(input == 0){
                break;
            }
            students.add(input);
        }

        int total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i);
        }

        double average = (double) total / students.size();
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
