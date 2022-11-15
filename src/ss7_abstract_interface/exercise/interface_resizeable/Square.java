package ss7_abstract_interface.exercise.interface_resizeable;


public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void resize(double percent) {
        setSide(getWidth() * (percent / 100 + 1));
    }
}
