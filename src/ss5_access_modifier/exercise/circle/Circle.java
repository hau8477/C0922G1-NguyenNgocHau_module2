package ss5_access_modifier.exercise.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
