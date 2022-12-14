package P17ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;

public class P03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger resultBigNum = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            resultBigNum = resultBigNum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(resultBigNum);
    }
}