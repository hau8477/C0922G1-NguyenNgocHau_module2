import java.util.*;

public class ttt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the row: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter the column: ");
        int column = Integer.parseInt(scanner.nextLine());

        int[][] array2D = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array2D[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.toString(solution(array2D)));
    }
    public static int[] solution(int[][] array2D) {
        Set<Integer> listPrime = new TreeSet<>();

        for (int[] ints : array2D) {
            for (int anInt : ints) {
                if (anInt >= 2 && checkPrime(anInt)) {
                    listPrime.add(anInt);
                }
            }
        }
        int[] listPrime1 = new int[listPrime.size()];
        for (Integer i : listPrime) {
            for (int j = 0; j < listPrime.size(); j++) {
                listPrime1[j] = i;
            }
        }
        return listPrime1;
    }

    public static boolean checkPrime(int a) {
        boolean check = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
