package ss7_abstract_interface.exercise.interface_resizeable;

public class InterfaceResizeableMain {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle(3.0);
        geometries[1] = new Rectangle(4.0,7.0);
        geometries[2] = new Square(5.0);

        System.out.println("Area before: " );
        for (Geometry geometry:geometries) {
            System.out.println(geometry.getArea());
        }

        geometries[0].resize(100);
        geometries[1].resize(100);
        geometries[2].resize(100);

        System.out.println("Area after: " );
        for (Geometry geometry:geometries) {
            System.out.println(geometry.getArea());
        }
    }
}
