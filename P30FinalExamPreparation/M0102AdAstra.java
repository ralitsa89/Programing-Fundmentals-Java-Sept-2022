package P31Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class M0102AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        String regex = "(\\||#)(?<name>[A-Za-z\\s]+)\\1(?<data>\\d{2}[\\/]\\d{2}[\\/]\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();

        int totalCalories = 0;
        while (matcher.find()){
            String name = matcher.group("name");
            String data = matcher.group("data");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;
            sb.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", name, data, calories));
        }
        int days = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(sb);
    }
}
