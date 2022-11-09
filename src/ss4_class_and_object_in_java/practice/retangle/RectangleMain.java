package ss4_class_and_object_in_java.practice.retangle;

import ss4_class_and_object_in_java.practice.retangle.Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = Double.parseDouble(input.nextLine());
        System.out.print("Enter the height: ");
        double height = Double.parseDouble(input.nextLine());

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
