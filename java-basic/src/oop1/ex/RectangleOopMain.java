package oop1.ex;

import java.util.Scanner;

public class RectangleOopMain {
    public static void main(String[] args) {
        int width = 0;
        int height = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("넓이 : ");
        width = scanner.nextInt();
        System.out.print("높이 : ");
        height = scanner.nextInt();

        scanner.nextLine();
        Rectangle rectangle = new Rectangle();
        rectangle.width = width;
        rectangle.height = height;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}
