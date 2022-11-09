package ss4_class_and_object_in_java.exercise.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quadratic Equation: ax^2 + bx + c");
        System.out.print("Please enter a: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.print("Please enter b: ");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("Please enter c: ");
        double c = Double.parseDouble(input.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            System.out.println("Roots 1 = " + quadraticEquation.getRoots1() + "\n" + "Roots 2 = " + quadraticEquation.getRoots2());
        } else if (delta == 0) {
            System.out.println("Roots 1 = Roots 2 = " + quadraticEquation.getRoots1());
        } else System.out.println("The equation has no roots");
    }
}
