package P08ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

//        for (int index = 0; index <= array.length - 1; index++) {
//            int currentNum = array[index];
//            for (int inIndex = index + 1; inIndex <= array.length - 1; inIndex++) {
//                int inNum = array[inIndex];
//                if (currentNum + inNum == number) {
//                    System.out.println(currentNum + " " + inNum);
//                }
//            }
//        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if(array[i] + array[j] == number){
                    System.out.println(array[i] + " " + array[j]);
                }
            }

        }
    }
}
