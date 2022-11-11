package ss6_inheritance_and_polymorphism.exercise.point2dand3d.point2d;

import ss6_inheritance_and_polymorphism.exercise.point2dand3d.point2d.Point2D;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4,5);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
        point2D.setX(10);
        point2D.setY(20);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
        point2D.setXY(30,50);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
    }
}
