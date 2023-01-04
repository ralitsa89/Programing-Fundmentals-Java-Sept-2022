package P30FinalExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class P0401PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        String[] text = scanner.nextLine().split("\\s+");
        while (!text[0].equals("Done")) {
            String command = text[0];
            switch (command) {
                case "TakeOdd":
                    int count = 1;
                    String newPass = "";
                    for (int i = 0; i < input.length(); i++) {
                        count++;
                        if (count % 2 != 0) {
                            newPass += input.charAt(i);
                        }
                    }
                    input = newPass;
                    System.out.println(input);
                    break;
                case "Cut":
                    int index = Integer.parseInt(text[1]);
                    int length = Integer.parseInt(text[2]);
                    input = input.substring(0, index) + input.substring(index + length, input.length());
                    System.out.println(input);
                    break;
                case "Substitute":
                    String substring = text[1];
                    String substitute = text[2];
                    if (input.contains(substring)) {
                        input = input.replaceAll(substring, substitute);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            text = scanner.nextLine().split("\\s+");
        }
        System.out.println("Your password is: " + input);
    }
}
