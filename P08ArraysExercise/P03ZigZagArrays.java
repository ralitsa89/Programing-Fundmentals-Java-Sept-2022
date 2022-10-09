package P08ArraysExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine();
            String firstNum = input.split(" ")[0];
            String secondNum = input.split(" ")[1];

            if ((row + 1) % 2 == 1) {
                firstArr[row] = firstNum;
                secondArr[row] = secondNum;
            } else {
                firstArr[row] = secondNum;
                secondArr[row] = firstNum;
            }
        }
        for (String element : firstArr) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (String element : secondArr) {
            System.out.print(element + " ");
        }
    }
}
