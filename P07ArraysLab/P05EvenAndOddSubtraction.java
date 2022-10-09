package P07ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int item : numbersArr) {
            if(item % 2 == 0){
                evenSum += item;
            }else {
                oddSum += item;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
