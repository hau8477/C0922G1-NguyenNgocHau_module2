package ss6_inheritance_and_polymorphism.practice.shape.square;

import ss6_inheritance_and_polymorphism.practice.shape.rectangle.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side,side);
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public double getSide() {
        return getWidth();
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
