package ss6_inheritance_and_polymorphism.exercise.circleandcylinder.cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.3, "Black", 10);
        System.out.println(cylinder);
        System.out.println("Area is: " + cylinder.getArea());
        System.out.println("Volume is: " + cylinder.getVolume());
    }
}
