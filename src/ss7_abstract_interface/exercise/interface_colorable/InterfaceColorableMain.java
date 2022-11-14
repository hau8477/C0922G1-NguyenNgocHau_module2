package ss7_abstract_interface.exercise.interface_colorable;

import ss7_abstract_interface.exercise.interface_resizeable.Circle;
import ss7_abstract_interface.exercise.interface_resizeable.Geometry;
import ss7_abstract_interface.exercise.interface_resizeable.Rectangle;

public class InterfaceColorableMain {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle(2.0);
        geometries[1] = new Square(7.0);
        geometries[2] = new Rectangle(6.0,10.0);


        System.out.println("Area before: " );
        for (Geometry geometry:geometries) {
            System.out.println(geometry.getArea());
            if (geometry instanceof Square) {
                Colorable colorable = (Colorable) geometry;
                colorable.howToColor();
            }
        }

    }
}
