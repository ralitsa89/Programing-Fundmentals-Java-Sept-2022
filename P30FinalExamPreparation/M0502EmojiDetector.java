package P31Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class M0502EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        String regex = "(\\:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        String regexNum = "(?<number>[0-9])";

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regexNum);
        Matcher matcherEmoji = pattern.matcher(input);
        Matcher matcherNumbers = pattern1.matcher(input);

        List<String> coolList = new ArrayList<>();

        int coolThreshold = 1;
        while (matcherNumbers.find()) {
            int number = Integer.parseInt(matcherNumbers.group("number"));
            coolThreshold *= number;
        }

        int sumEmojiName = 0;
        int count = 0;
        while (matcherEmoji.find()) {
            String nameEmoji = matcherEmoji.group("emoji");
            for (int i = 0; i <= nameEmoji.length() - 1; i++) {
                char value = nameEmoji.charAt(i);
                sumEmojiName += value;
            }
            if (coolThreshold < sumEmojiName) {
                String emoji = matcherEmoji.group();
                coolList.add(emoji);
            }
            sumEmojiName = 0;
            count++;
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(count + " emojis found in the text. The cool ones are:");
        for (String emoji : coolList) {
            System.out.println(emoji);
        }

    }
}
