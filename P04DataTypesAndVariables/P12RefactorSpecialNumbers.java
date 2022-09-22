package P04DataTypesAndVariables;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isSpecialNum = false;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int currentNum = i;

            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum) {
                System.out.printf("%d -> True%n", i); //because we set it to "false"
            } else {
                System.out.printf("%d -> False%n", i); //when isn't "false" it's true
            }
        }
    }
}