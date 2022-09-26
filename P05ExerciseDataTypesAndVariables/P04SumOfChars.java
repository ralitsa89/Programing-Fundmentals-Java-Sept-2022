package P05ExerciseDataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int symbol = 1; symbol <= n; symbol++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum += code;
            //we can write it only in one line:   sum += scanner.nextLine().charAt(0);
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
