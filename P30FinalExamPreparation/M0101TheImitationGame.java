package P31Test;

import java.util.Scanner;

import static java.lang.System.in;

public class M0101TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String message = scanner.nextLine();

        String[] input = scanner.nextLine().split("\\|");
        while (!input[0].equals("Decode")) {

            switch (input[0]) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(input[1]);
                    String letters = message.substring(0, numberOfLetters);
                    message = message.substring(numberOfLetters);
                    message = message + letters;
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[1]);
                    String value = input[2];

                    String first = message.substring(0, index);
                    String second = message.substring(index); //?
                    message = first + value + second;
                    break;
                case "ChangeAll":
                    StringBuilder newMessage = new StringBuilder(message);
                    String substring = input[1];
                    String replacement = input[2];
                    newMessage.replace(0, newMessage.length(), message.replace(substring, replacement));
                    message = newMessage.toString();
                    break;
            }

            input = scanner.nextLine().split("\\|");

        }
        System.out.println("The decrypted message is: " + message);
    }
}
