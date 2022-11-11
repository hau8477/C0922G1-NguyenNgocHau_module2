package ss6_inheritance_and_polymorphism.exercise.point2dand3d.point3d;

import ss6_inheritance_and_polymorphism.exercise.point2dand3d.point3d.Point3D;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D0 = new Point3D();
        System.out.println(point3D0);

        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
        point3D.setX(6);
        point3D.setY(7);
        point3D.setZ(8);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
        point3D.setXYZ(9,10,11);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }

}
