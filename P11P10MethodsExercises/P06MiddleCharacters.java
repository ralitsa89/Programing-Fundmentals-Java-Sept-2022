package P11P10MethodsExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        printMiddleChar(text);
    }
    public static void printMiddleChar(String text){
        if(text.length()% 2 == 0){
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));
        }else{
            System.out.print(text.charAt(text.length() / 2));
        }
    }
}
