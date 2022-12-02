package algorithm;

public class HollowRhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
