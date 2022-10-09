package P08ArraysExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= countRotations; rotations++) {
            String firstElement = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            array[array.length - 1] = firstElement;
        }
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
}
