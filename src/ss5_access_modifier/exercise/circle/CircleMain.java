package ss5_access_modifier.exercise.circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3,"Blue");
        System.out.println(circle1 + " " + "Area circle default: " + circle1.getArea());
        System.out.println(circle2 + " " + "Area circle 2: " + circle2.getArea());}
}
