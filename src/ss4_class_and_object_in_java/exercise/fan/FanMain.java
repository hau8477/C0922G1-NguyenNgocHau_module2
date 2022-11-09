package ss4_class_and_object_in_java.exercise.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "Yellow");
        System.out.println("Before: " + fan1);
        fan1.setColor("Black");
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(15);
        System.out.println("After: " + fan1);

        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "Blue");
        System.out.println("Before: " + fan2);
        fan2.setOn(true);
        System.out.println("After: " + fan2);
    }
}
