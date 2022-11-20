package P30FinalExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class P0201WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stopName = commandParts[2];
                    if (isValidIndex(index, stops)) {
                        String firstHalf = stops.substring(0, index);
                        String secondHalf = stops.substring(index);
                        stops = new StringBuilder(firstHalf + stopName + secondHalf);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (isValidIndex(startIndex, stops) && isValidIndex(endIndex, stops)) {
                        stops.delete(startIndex, endIndex + 1);
                    }
                    break;
                case "Switch":
                    String oldStop = commandParts[1];
                    String newStop = commandParts[2];
                    if (stops.toString().contains(oldStop)) {
                        stops = new StringBuilder(stops.toString().replace(oldStop, newStop));
                    }
                    break;
            }
            System.out.println(stops);
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }

    public static boolean isValidIndex(int index, StringBuilder stops) {
        return index >= 0 && index < stops.toString().length();
    }
}