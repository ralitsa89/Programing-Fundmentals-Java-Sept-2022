package P10Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String inputText = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = repeatString(n, inputText);
        System.out.println(result);
    }
    private static String repeatString(int n, String text){
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + text;
        }
        return result;

    }
}
