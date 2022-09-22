package P02BasicSyntaxExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int n = n1; n <= n2; n++) {
            System.out.print(n + " ");
            sum += n;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
