package ss7_abstract_interface.exercise.interface_colorable;

import ss7_abstract_interface.exercise.interface_resizeable.Rectangle;

public class Square extends Rectangle implements Colorable {
    private double side;

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
