package ss7_abstract_interface.practice.implement_comparator_for_geometry_class;

import ss6_inheritance_and_polymorphism.practice.shape.circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) {
            return 1;
        } else if (c1.getRadius() < c2.getRadius()) {
            return -1;
        } else return 0;
    }
}
