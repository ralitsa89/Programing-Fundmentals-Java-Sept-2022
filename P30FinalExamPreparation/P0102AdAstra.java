package P30FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class P0102AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        String regex = "([#|\\|])(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;
        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            String foodName = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;

           sb.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, date, calories));
        }
        int days = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(sb);
    }
}