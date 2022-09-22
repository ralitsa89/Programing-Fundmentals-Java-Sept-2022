package P03MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int clicks = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < clicks; i++) {
            String digits = scanner.nextLine();
            int digitLength = digits.length();   //Find the number of digits
            char oneDigit = digits.charAt(0);    //returns the first character in our string
            int mainDigit = Character.getNumericValue(oneDigit); //(this method returns the numeric value of the character) Find the main digit of the number
            int offset = (mainDigit - 2) * 3;  //Find the offset of the number
            if (mainDigit == 8 || mainDigit == 9) {
                offset = (mainDigit - 2) * 3 + 1;//If the main digit is 8 or 9, we need to add 1 to the offset since the digits 7 and 9 have 4 letters each
            }
            int letterIndex = (offset + digitLength - 1); //find the letter index (a -> 0, c -> 2, etc.)
            int letterCode = letterIndex + 97; //add that to the ASCII code of the lowercase letter "a" (97)

            char letter = (char) letterCode;
            if(mainDigit == 0){
                letter = (char) (mainDigit + 32);
            }
            message += letter;
        }
        System.out.println(message);
    }
}
