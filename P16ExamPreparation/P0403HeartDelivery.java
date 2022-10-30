package P16ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P0403HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] evenArr = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        int lastPosition = 0;
        int successMission = 0;

        String input = scanner.nextLine();
        while (!input.equals("Love!")) {
            String[] commands = input.split("\\s+");
            int givenLength = Integer.parseInt(commands[1]);
            lastPosition += givenLength;

            if (lastPosition < 0 || lastPosition > evenArr.length - 1) {
                lastPosition = 0;
            }
            if (evenArr[lastPosition] != 0) {
                evenArr[lastPosition] -= 2;
                if (evenArr[lastPosition] == 0){
                    successMission++;
                    System.out.printf("Place %d has Valentine's day.%n", lastPosition);
                }
            }else{
                System.out.printf("Place %d already had Valentine's day.%n", lastPosition);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);
        if (successMission == evenArr.length) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", evenArr.length - successMission);
        }
    }
}
