package P31Test;

import java.util.Scanner;

import static java.lang.System.in;

public class M0201WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String stops = scanner.nextLine();

        String[] input = scanner.nextLine().split(":");
        while (!input[0].equals("Travel")) {

            switch (input[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(input[1]);
                    String string = input[2];
                    if (index >= 0 && index < stops.length()) {
                        stops = stops.substring(0, index) + string + stops.substring(index);
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(input[1]);
                    int endIndex = Integer.parseInt(input[2]);
                    if ((startIndex >= 0 && startIndex < stops.length()) && ((endIndex >= 0 && endIndex < stops.length()))) {
                        stops = stops.substring(0, startIndex) + stops.substring(endIndex + 1);
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = input[1];
                    String newString = input[2];
                    if (stops.contains(oldString)) {
                        stops = stops.replaceAll(oldString, newString);
                    }
                    System.out.println(stops);
                    break;
            }
            input = scanner.nextLine().split(":");
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
