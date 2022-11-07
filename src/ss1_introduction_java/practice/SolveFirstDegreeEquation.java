package ss1_introduction_java.practice;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("First degree equation");
        System.out.println("The equation has the form: ax+b = 0. Please enter the coefficients a,b ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = Float.parseFloat(scanner.nextLine());
        System.out.print("b = ");
        double b = Float.parseFloat(scanner.nextLine());

        if (a != 0) {
            double answer = -b / a;
            System.out.println("Result: x = " + answer);
        } else if (b != 0) {
            System.out.println("The equation has no solution");
        } else System.out.println("The equation has infinitely many solutions");
    }
}
