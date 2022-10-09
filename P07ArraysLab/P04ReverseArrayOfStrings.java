package P07ArraysLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] inputArr = scanner.nextLine().split( " ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", inputArr));
    }
}
