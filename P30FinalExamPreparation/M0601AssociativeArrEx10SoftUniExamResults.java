package P31Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class M0601AssociativeArrEx10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> pointsMap = new LinkedHashMap<>();
        Map<String, Integer> countMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] split = input.split("-");
            String username = split[0];

            if (split.length == 3) {
                String language = split[1];
                int points = Integer.parseInt(split[2]);

                if (!pointsMap.containsKey(username)) {
                    pointsMap.put(username, points);
                } else {
                    int currentPoints = pointsMap.get(username);
                    if (points > currentPoints) {
                        pointsMap.put(username, points);
                    }
                }
                if (!countMap.containsKey(language)) {
                    countMap.put(language, 1);
                } else {
                    countMap.put(language, countMap.get(language) + 1);
                }
            } else {
                pointsMap.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        pointsMap.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        countMap.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });
    }
}
