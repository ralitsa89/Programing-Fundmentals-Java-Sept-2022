package P06MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            double n1 = Double.parseDouble(scanner.next());         ///scanner.next() instead of scanner.nextLine() !!
            double n2 = Double.parseDouble(scanner.next());

            int sum = 0;
            if (n1 > n2) {
                double leftNum = Math.abs(n1);                  ///using Math.abs to find only absolute value of the numbers  !!
                while (leftNum > 0) {
                    sum += leftNum % 10;
                    leftNum = leftNum / 10;
                }
            } else {
                double rightNum = Math.abs(n2);
                while (rightNum > 0) {
                    sum += rightNum % 10;
                    rightNum = rightNum / 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}