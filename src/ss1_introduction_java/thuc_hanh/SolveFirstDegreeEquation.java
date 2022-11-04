package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class SolveFirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất");
        System.out.println("Phương trình có dạng: ax+b = 0. Hãy nhập các đối số a,b ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = Float.parseFloat(scanner.nextLine());
        System.out.print("b = ");
        double b = Float.parseFloat(scanner.nextLine());

        if (a != 0) {
            double answer = -b / a;
            System.out.println("Kết quả: x = " + answer);
        } else if (b != 0) {
            System.out.println("Phương trình vô nghiệm");
        } else System.out.println("Phương trình có vô số nghiệm");
    }
}
