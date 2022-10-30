package P16ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P0302ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] shotTargetsArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        int currentTarget = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] index = input.split("");
            int target = Integer.parseInt(index[0]);

            if (target > shotTargetsArr.length - 1) {
                input = scanner.nextLine();
                continue;
            }
            if (target >= 0) {
                currentTarget = shotTargetsArr[target];
                shotTargetsArr[target] = -1;
                count++;
            }
            for (int i = 0; i < shotTargetsArr.length; i++) {
                if (currentTarget < shotTargetsArr[i]) {
                    shotTargetsArr[i] -= currentTarget;
                } else if (currentTarget >= shotTargetsArr[i] && shotTargetsArr[i] != -1) {
                    shotTargetsArr[i] += currentTarget;
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        for (int element : shotTargetsArr) {
            System.out.print(element + " ");
        }
    }
}
