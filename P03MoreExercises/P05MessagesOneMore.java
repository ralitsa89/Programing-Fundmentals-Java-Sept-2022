package P03MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P05MessagesOneMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int clicks = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < clicks; i++) {
            String digits = scanner.nextLine();

            int digitLength = digits.length();  //Find the number of digits
            char oneDigit = digits.charAt(0);   //returns the first character in our string

            if (oneDigit == '2') {
                if (digitLength == 1) {
                    message += "a";
                } else if (digitLength == 2) {
                    message += "b";
                } else if (digitLength == 3) {
                    message += "c";
                }
            } else if (oneDigit == '3') {
                if (digitLength == 1) {
                    message += "d";
                } else if (digitLength == 2) {
                    message += "e";
                } else if (digitLength == 3) {
                    message += "f";
                }
            } else if (oneDigit == '4') {
                if (digitLength == 1) {
                    message += "g";
                } else if (digitLength == 2) {
                    message += "h";
                } else if (digitLength == 3) {
                    message += "i";
                }
            } else if (oneDigit == '5') {
                if (digitLength == 1) {
                    message += "j";
                } else if (digitLength == 2) {
                    message += "k";
                } else if (digitLength == 3) {
                    message += "l";
                }
            } else if (oneDigit == '6') {
                if (digitLength == 1) {
                    message += "m";
                } else if (digitLength == 2) {
                    message += "n";
                } else if (digitLength == 3) {
                    message += "o";
                }
            } else if (oneDigit == '7') {
                if (digitLength == 1) {
                    message += "p";
                } else if (digitLength == 2) {
                    message += "q";
                } else if (digitLength == 3) {
                    message += "r";
                } else if (digitLength == 4) {
                    message += "s";
                }
            } else if (oneDigit == '8') {
                if (digitLength == 1) {
                    message += "t";
                } else if (digitLength == 2) {
                    message += "u";
                } else if (digitLength == 3) {
                    message += "v";
                }
            } else if (oneDigit == '9') {
                if (digitLength == 1) {
                    message += "w";
                } else if (digitLength == 2) {
                    message += "x";
                } else if (digitLength == 3) {
                    message += "y";
                } else if (digitLength == 4) {
                    message += "z";
                }
            }else if(oneDigit == '0'){
                message += " ";
            }
        }
        System.out.println(message);
    }
}
