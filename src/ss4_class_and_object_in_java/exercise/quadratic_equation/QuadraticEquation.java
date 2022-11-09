package ss4_class_and_object_in_java.exercise.quadratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(getB(), 2) - 4 * getA() * getC());
    }
    public double getRoots1() {
        return (-getB()+Math.sqrt(getDiscriminant()))/2*getA();
    }
    public double getRoots2() {
        return (-getB()-Math.sqrt(getDiscriminant()))/2*getA();
    }
}
