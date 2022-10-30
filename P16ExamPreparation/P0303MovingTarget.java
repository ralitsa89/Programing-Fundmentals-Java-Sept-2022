package P16ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P0303MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandsLine = input.split("\\s+");
            String command = commandsLine[0];
            int index = Integer.parseInt(commandsLine[1]);

            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(commandsLine[2]);
                    if (index >= 0 && index < targetsList.size()) {
                        int newElement = targetsList.get(index);
                        newElement -= power;
                        targetsList.set(index, newElement);
                        if (newElement <= 0) {
                            targetsList.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commandsLine[2]);
                    if (index >= 0 && index < targetsList.size()) {
                        targetsList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandsLine[2]);
                    if (index - radius >= 0 && index + radius < targetsList.size() - 1) {
                        targetsList.subList(index - radius, index + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < targetsList.size(); i++) {
            if (i == targetsList.size() - 1) {
                System.out.print(targetsList.get(i));
            } else {
                System.out.print(targetsList.get(i) + "|");
            }
        }
    }
}