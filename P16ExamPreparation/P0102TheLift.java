package P16ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P0102TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int tourists = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                if (tourists >= 4 - lift[i]) {
                    tourists -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += tourists;
                    tourists = 0;
                }
            }
        }
        boolean isNotFull = false;

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                isNotFull = true;
                break;
            }
        }
        if (tourists == 0 && isNotFull) {
            System.out.println("The lift has empty spots!");
        } else if (tourists > 0 && !isNotFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", tourists);
        }
        for (int num : lift) {
            System.out.print(num + " ");
        }
    }
}