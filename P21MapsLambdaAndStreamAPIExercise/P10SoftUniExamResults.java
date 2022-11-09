package P21MapsLambdaAndStreamAPIExercise;

import java.util.*;

import static java.lang.System.in;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> userPoint = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] splitArr = input.split("-");
            String username = splitArr[0];
            if (splitArr.length == 3) {
                String language = splitArr[1];
                int points = Integer.parseInt(splitArr[2]);

                if (!userPoint.containsKey(username)) {
                    userPoint.put(username, points);
                } else {
                    int currentPoints = userPoint.get(username);
                    if (points > currentPoints) {
                        userPoint.put(username, points);
                    }
                }
                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                } else {
                    languageCount.put(language, languageCount.get(language) + 1);
                }
            } else {
                userPoint.remove(username);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        userPoint.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        languageCount.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });

    }
}
