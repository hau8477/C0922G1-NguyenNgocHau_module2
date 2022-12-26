package algorithm;

import java.util.*;

public class MaxString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrString = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string: ");
            arrString[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(arrString));


        int minString = arrString[0].length();
        int index = 0;

        for (int i = 1; i < arrString.length; i++) {
            if (minString > arrString[i].length()) {
                minString = arrString[i].length();
                index = i;
            }
        }

        List<Character> commonString = new ArrayList<>();
        boolean check = false;

        for (int i = 0; i < minString; i++) {
            for (int j = 0; j < arrString.length; j++) {
                if (j != index) {
                    if (arrString[index].charAt(i) == arrString[j].charAt(i)) {
                        check = true;
                    }
                }
                if (check) {
                    commonString.add(arrString[index].charAt(i));
                }
                check = false;
            }
        }
        System.out.println(commonString);
    }
}
