package P15P09MoreExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;
        double sum1 = 0;
        for (int i = 0; i < numbersList.size() / 2; i++) {
            if (numbersList.get(i) == 0) {
                sum = sum - (sum * 0.2);
            } else {
                sum += numbersList.get(i);
            }
        }
        for (int i = numbersList.size() - 1; i > numbersList.size() / 2; i--) {
            if (numbersList.get(i) == 0) {
                sum1 = sum1 - (sum1 * 0.2);
            } else {
                sum1 += numbersList.get(i);
            }
        }
        if (sum < sum1) {
            System.out.printf("The winner is left with total time: %.1f", sum);
        } else {
            System.out.printf("The winner is right with total time: %.1f", sum1);
        }
    }
}
