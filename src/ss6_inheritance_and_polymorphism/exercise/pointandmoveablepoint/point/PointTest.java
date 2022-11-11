package ss6_inheritance_and_polymorphism.exercise.pointandmoveablepoint.point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point(5,10);
        System.out.println(point1);
        point1.setX(15);
        point1.setY(20);
        System.out.println(point1);
        point1.setXY(25,30);
        System.out.println(point1);
    }
}
