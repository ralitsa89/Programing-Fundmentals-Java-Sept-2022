package P22AssociativeArraysMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, LinkedHashMap<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of contests")){
            String[] tokens = input.split(":");
            String contest = tokens[0];
            String password = tokens[1];

            if (!contests.containsKey(contest)) {
                contests.put(contest, password);
            }else {
                contests.put(contest, password);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("end of submissions")){
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if(contests.containsKey(contest)){
                if(contests.get(contest).equals(password)){

                    LinkedHashMap<String, Integer> course = new LinkedHashMap<>();
                    course.put(contest,points);
                    if(!users.containsKey(username)){
                        users.put(username, course);
                    }else{
                        if(!users.get(username).containsKey(contest)){
                            users.get(username).put(contest, points);
                        }else{
                            users.get(username).put(contest, Math.max(points, users.get(username).get(contest)));
                        }
                    }
                }
            }

            input = scanner.nextLine();
        }
        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user  : users.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if(sum > totalSum){
                totalSum = sum;
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet()) {
            if(user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum){
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        users.forEach((key, value) -> {
            System.out.printf("%s%n",key);
            value.entrySet().stream()
                    .sorted((f,s) -> s.getValue() - f.getValue())
                    .forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
