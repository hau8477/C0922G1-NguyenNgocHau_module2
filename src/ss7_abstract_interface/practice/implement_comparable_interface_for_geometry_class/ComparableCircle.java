package ss7_abstract_interface.practice.implement_comparable_interface_for_geometry_class;

import ss6_inheritance_and_polymorphism.practice.shape.circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        } else return -1;
    }
}
