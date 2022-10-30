package P16ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P0202ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "swap":
                    int swapIndexOne = Integer.parseInt(commandArr[1]);
                    int swapIndexTwo = Integer.parseInt(commandArr[2]);

                    int valueAtIndexOne = numberArr[swapIndexOne];
                    int valueAtIndexTwo = numberArr[swapIndexTwo];

                    numberArr[swapIndexOne] = valueAtIndexTwo;
                    numberArr[swapIndexTwo] = valueAtIndexOne;
                    break;
                case "multiply":
                    int multiplyIndexOne = Integer.parseInt(commandArr[1]);
                    int multiplyIndexTwo = Integer.parseInt(commandArr[2]);

                    int product = numberArr[multiplyIndexOne] * numberArr[multiplyIndexTwo];
                    numberArr[multiplyIndexOne] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < numberArr.length; i++) {
                        numberArr[i] = numberArr[i] - 1;
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        for (int i = 0; i < numberArr.length; i++) {
            if (i == numberArr.length - 1) {
                System.out.print(numberArr[i]);
            } else {
                System.out.print(numberArr[i] + ", ");
            }
        }
    }
}
