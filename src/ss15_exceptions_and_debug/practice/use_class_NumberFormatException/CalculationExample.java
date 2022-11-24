package ss15_exceptions_and_debug.practice.use_class_NumberFormatException;

public class CalculationExample {
    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e ) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
