package P09MoreExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int lines = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[lines];

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            int inputLength = input.length();

            int sum = 0;
            for (int j = 0; j < inputLength; j++) {
                char currentChar = input.charAt(j);
                switch (currentChar) {
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        sum += currentChar * inputLength;
                        break;
                    default:
                        sum += currentChar / inputLength;
                        break;
                }
            }
            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int print : numbers){
            System.out.println(print);
        }
    }
}
