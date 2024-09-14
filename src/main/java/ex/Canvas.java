package ex;

import java.util.Scanner;

public class Canvas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Введите длину прямоугольника: ");
        int b = Integer.parseInt(input.nextLine());
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println(rectangle.draw());
        System.out.println("Площадь прямоугольника равна: " + rectangle.square());
    }
}
