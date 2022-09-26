package P06MoreExercises;

import java.util.Scanner;

public class P04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= number; i++) {
            boolean isEqual = true;
            for (int divider = 2; divider < i; divider++) {
                if (i % divider == 0) {
                    isEqual = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isEqual);
        }
    }
}
