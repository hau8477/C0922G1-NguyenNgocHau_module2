package ss6_inheritance_and_polymorphism.exercise.point2dand3d.point3d;

import ss6_inheritance_and_polymorphism.exercise.point2dand3d.point2d.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), getZ()};
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        setZ(z);
    }

    public String toString() {
        return "Point2D (" + getX() + "," + getY() + "," + getZ() + ")";
    }
}
