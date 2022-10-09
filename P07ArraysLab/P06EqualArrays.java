package P07ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int diffIndex = 0;
        Boolean isIdentical = true;
        for (int i = 0; i < firstArr.length; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];
            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                diffIndex = i;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.%n", diffIndex);
        }
    }
}
