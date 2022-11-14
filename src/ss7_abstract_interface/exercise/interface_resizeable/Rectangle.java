package ss7_abstract_interface.exercise.interface_resizeable;

public class Rectangle extends Geometry {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double longs) {
        this.width = width;
        this.length = longs;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() * (percent / 100 + 1));
        setWidth(getWidth() * (percent / 100 + 1));
    }
}
