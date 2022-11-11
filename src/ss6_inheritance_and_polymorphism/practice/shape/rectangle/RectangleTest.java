package ss6_inheritance_and_polymorphism.practice.shape.rectangle;

import ss6_inheritance_and_polymorphism.practice.shape.rectangle.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5,5.0);
        System.out.println(rectangle);

        rectangle = new Rectangle("Yellow",false,4.0,6.5);
        System.out.println(rectangle);
    }
}
