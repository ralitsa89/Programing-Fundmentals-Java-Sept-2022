package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            if (!isPalindrome(input)) {
                System.out.println("false");
            }else {
                System.out.println("true");
            }
            input = scanner.nextLine();
        }
    }
    public static boolean isPalindrome(String input){
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return input.equals(reversedString);
    }
}
