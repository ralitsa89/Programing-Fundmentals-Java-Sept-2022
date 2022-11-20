package P30FinalExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class P0101TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                case "ChangeAll":
                    message = changeAll(message, commandParts[1], commandParts[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + commandName);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static StringBuilder move(StringBuilder message, int length) {
        String firstPart = message.substring(0, length);
        message.replace(0, length, "");
        message.append(firstPart);
        return message;
    }

    private static StringBuilder insert(StringBuilder message, int index, String substring) {
        message.insert(index, substring);
        return message;
    }

    private static StringBuilder changeAll(StringBuilder message, String substring, String replacement) {
        message.replace(0, message.length(), message.toString().replace(substring, replacement));
        return message;
    }
}
