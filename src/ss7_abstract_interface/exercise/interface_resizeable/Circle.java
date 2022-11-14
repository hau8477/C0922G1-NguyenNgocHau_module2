package ss7_abstract_interface.exercise.interface_resizeable;

public class Circle extends Geometry {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * (percent / 100 + 1));
    }
}
