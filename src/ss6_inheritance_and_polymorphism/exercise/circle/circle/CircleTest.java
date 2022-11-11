package ss6_inheritance_and_polymorphism.exercise.circle.circle;

import ss6_inheritance_and_polymorphism.exercise.circle.circle.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5,"Red");
        System.out.println(circle);
        System.out.println("Area is: "+circle.getArea());

    }
}
