package P08ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

       int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            boolean isTop = true;
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                if(currentNumber > numbers[i]){
                    isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if(isTop){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
