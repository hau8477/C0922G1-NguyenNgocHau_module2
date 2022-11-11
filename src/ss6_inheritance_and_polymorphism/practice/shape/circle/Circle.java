package ss6_inheritance_and_polymorphism.practice.shape.circle;

import ss6_inheritance_and_polymorphism.practice.shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
}
