package P30FinalExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class M0301SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        String[] message = scanner.nextLine().split(":\\|:");
        while (!message[0].equals("Reveal")) {
            String command = message[0];
            switch (command) {
                case "InsertSpace":
                    int indexOfSpace = Integer.parseInt(message[1]);
                    input = input.substring(0, indexOfSpace) + " " + input.substring(indexOfSpace);
                    System.out.println(input);
                    break;
                case "Reverse":
                    String text = message[1];
                    StringBuilder sb = new StringBuilder(input);
                    if (input.contains(text)) {
                        int start = sb.indexOf(text);
                        int end = start + text.length();
                        sb.replace(start, end, "");
                        String reversed = "";
                        for (int i = text.length() - 1; i >= 0; i--) {
                            char currentSymbol = text.charAt(i);
                            reversed += currentSymbol;
                        }
                        sb.append(reversed);
                        input = sb.toString();
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    input = sb.toString();
                    break;
                case "ChangeAll":
                    input = input.replace(message[1], message[2]);
                    System.out.println(input);
                    break;
            }
            message = scanner.nextLine().split(":\\|:");
        }
        System.out.println("You have a new text message: " + input);
    }
}
