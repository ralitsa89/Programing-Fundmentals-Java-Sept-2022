package P09MoreExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] currentArray = { 1 };
        for (int row = 1; row < rows; row++) {
            int [] nextArr = new int[currentArray.length + 1];
            for (int line = 0; line < currentArray.length; line++) {

                nextArr[line] += currentArray[line];
                nextArr[line + 1] += currentArray[line];
            }

            System.out.println(Arrays.toString(currentArray).replace("[", "")
                    .replace("]", "").replace(",",""));
            currentArray = nextArr;
        }
        System.out.println(Arrays.toString(currentArray).replace("[", "")
                .replace("]", "").replace(",",""));
    }
}
