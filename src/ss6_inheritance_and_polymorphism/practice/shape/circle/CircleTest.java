package ss6_inheritance_and_polymorphism.practice.shape.circle;

import ss6_inheritance_and_polymorphism.practice.shape.circle.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.5);
        System.out.println(circle);

        circle = new Circle("Black",true,6.5);
        System.out.println(circle);
    }
}
