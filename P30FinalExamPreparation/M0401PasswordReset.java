package P31Test;

import java.util.Scanner;

import static java.lang.System.in;

public class M0401PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String commands = input.split(" ")[0];
            switch (commands) {
                case "TakeOdd":
                    String password = "";
                    for (int i = 0; i < text.length() - 1; i++) {
                        if (i % 2 == 0) {
                            char currentChar = text.charAt(i + 1);
                            password += currentChar;
                        }
                    }
                    text = password;
                    System.out.println(text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    int length = Integer.parseInt(input.split(" ")[2]);
                    String pass = text.substring(0, index) + text.substring(index + length);
                    text = pass;
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substring =input.split(" ")[1];
                    String substitute = input.split(" ")[2];
                    if(text.contains(substring)){
                        text = text.replace(substring, substitute);
                        System.out.println(text);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + text);
    }
}
