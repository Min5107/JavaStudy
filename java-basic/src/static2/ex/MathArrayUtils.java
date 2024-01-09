package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils(){};

    static void sum(int[] values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum : " + sum);
    }

    static void average(int[] values){
        int sum = 0;
        double total = 0;
        for (int value : values) {
            sum += value;
        }
        total = sum / values.length;
        System.out.println("average : " + total);
    }

    static void min(int[] values){
        int minValue = values[0];
        for (int value : values) {
            if(value < minValue){
                minValue = value;
            }
        }
        System.out.println("Min : " + minValue);
    }

    static void max(int[] values){
        int maxValue = values[0];
        for (int value : values) {
            if(value > maxValue){
                maxValue = value;
            }
        }
        System.out.println("Max : " + maxValue);
    }

}
