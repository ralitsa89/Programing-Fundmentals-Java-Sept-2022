package P04DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.System.in;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= n; i++) {
            BigDecimal currentNumb = new BigDecimal(scanner.nextLine());
            sum = sum.add(currentNumb);
        }
        System.out.println(sum);
    }
}
