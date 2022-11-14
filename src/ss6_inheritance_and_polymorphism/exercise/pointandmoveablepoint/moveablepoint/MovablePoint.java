package ss6_inheritance_and_polymorphism.exercise.pointandmoveablepoint.moveablepoint;

import ss6_inheritance_and_polymorphism.exercise.pointandmoveablepoint.point.Point;

public class MovablePoint extends Point {
    private float xSpeed,ySpeed;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    public MovablePoint move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }

    public String toString() {
        return super.toString() + ", speed = (" + getXSpeed() + "," + getYSpeed() + ")";
    }
}
