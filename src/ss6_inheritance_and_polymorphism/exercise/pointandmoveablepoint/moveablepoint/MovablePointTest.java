package ss6_inheritance_and_polymorphism.exercise.pointandmoveablepoint.moveablepoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint.setX(5);
        movablePoint.setY(10);
        System.out.println(movablePoint);
        movablePoint.setXSpeed(20);
        movablePoint.setYSpeed(25);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.setSpeed(35,40);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
