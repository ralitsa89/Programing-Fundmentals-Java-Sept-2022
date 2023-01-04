package P31Test;

import java.util.Scanner;

import static java.lang.System.in;

public class M0501ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String activationKey = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String command = input.split(">>>")[0];

            int startIndex = 0;
            int endIndex = 0;
            String substring = "";
            switch (command) {
                case "Contains":
                    substring = input.split(">>>")[1];
                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = input.split(">>>")[1];
                    startIndex = Integer.parseInt(input.split(">>>")[2]);
                    endIndex = Integer.parseInt(input.split(">>>")[3]);
                    substring = activationKey.substring(startIndex, endIndex);
                    if (upperOrLower.equals("Upper")) {
                        activationKey = activationKey.replace(substring, substring.toUpperCase());
                    } else {
                        activationKey = activationKey.replace(substring, substring.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(input.split(">>>")[1]);
                    endIndex = Integer.parseInt(input.split(">>>")[2]);
                    substring = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(substring, "");

                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}