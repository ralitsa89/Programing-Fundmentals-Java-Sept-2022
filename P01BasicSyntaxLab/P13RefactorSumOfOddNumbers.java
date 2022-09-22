package P01BasicSyntaxLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
            sum += (2 * i + 1);
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
