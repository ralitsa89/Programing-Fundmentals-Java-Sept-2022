package P07ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P0Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //2 8 30 25 40 72 -2 44 56

//        String values = scanner.nextLine();
//        String[] valuesArr = values.split("0");
//
//        int[] numberArr = new int[valuesArr.length];
//        for (int i = 0; i < valuesArr.length; i++) {
//            numberArr[i] = Integer.parseInt(valuesArr[i]);
//        }

        String lineInput = scanner.nextLine();
        int[] numbersArr = Arrays.stream(lineInput.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbersArr.length; i++) {
            System.out.printf("%d -> %d%n", i, numbersArr[i]);

        }
    }
}


