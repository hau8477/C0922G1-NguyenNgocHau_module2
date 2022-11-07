package ss2_loop_in_java.exercise;
public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        boolean check = true;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
            check = true;
        }
    }
}
