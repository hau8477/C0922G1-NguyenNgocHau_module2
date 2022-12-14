package ss6_inheritance_and_polymorphism.exercise.pointandmoveablepoint.point;

public class Point {
    private float x,y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{getX(),getY()};
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point (" + getX()  + ","+ getY() + ")";
    }
}
