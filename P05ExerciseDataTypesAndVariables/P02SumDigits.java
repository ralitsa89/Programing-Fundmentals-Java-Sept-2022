package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
