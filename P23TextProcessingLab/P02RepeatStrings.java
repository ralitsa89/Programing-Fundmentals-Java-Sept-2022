package P23TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] wordsArr = scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int length  = currentWord.length();

            String repeatWord = repeatString(currentWord, length);

            repeatList.add(repeatWord);
        }

        System.out.println(String.join("", repeatList));
    }
    public static String repeatString(String word, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word;
        }
        return result;
    }
}
