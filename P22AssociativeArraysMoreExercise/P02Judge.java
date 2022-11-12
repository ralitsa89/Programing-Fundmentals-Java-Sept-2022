package P22AssociativeArraysMoreExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.in;

public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, LinkedHashMap<String, Integer>> courseMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("no more time")){
            String[] inputArr = input.split(" -> ");
            String user = inputArr[0];
            String course = inputArr[1];
            int points = Integer.parseInt(inputArr[2]);

            if(!courseMap.containsKey(course)){
                courseMap.put(course, new LinkedHashMap<>());
                courseMap.get(course).put(user,points);
            }else{
                if(courseMap.get(course).containsKey(user)){      //check if user exist
                    if(courseMap.get(course).get(user) < points){   // if exist check points
                        courseMap.get(course).put(user, points);
                    }
                }else {
                    courseMap.get(course).put(user, points);    // if this user not exist just put it
                }
            }
            input = scanner.nextLine();
        }
        AtomicInteger number = new AtomicInteger();
        courseMap.forEach((key, value) -> {
            System.out.printf("%s: %d participants\n", key, value.size());
            number.set(1);
            Map<String, Integer> studentsRow = new HashMap<>();
            studentsRow = value;
            studentsRow.entrySet().stream().sorted((e1, e2) -> {
                if (Objects.equals(e2.getValue(), e1.getValue())) {
                    return e1.getKey().compareTo(e2.getKey());
                } else {
                    return e2.getValue() - e1.getValue();
                }
            }).forEach((s) -> System.out.printf("%d. %s <::> %d\n", number.getAndIncrement(), s.getKey(), s.getValue()));
        });
        Map<String, Integer> finalStandings = new TreeMap<>();
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : courseMap.entrySet()) {
            for (Map.Entry<String, Integer> go : entry.getValue().entrySet()) {
                finalStandings.putIfAbsent(go.getKey(), 0);
                finalStandings.put(go.getKey(), finalStandings.get(go.getKey()) + go.getValue());
            }
        }
        System.out.println("Individual standings:");
        number.set(1);
        finalStandings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%d. %s -> %d\n", number.getAndIncrement(), e.getKey(), e.getValue());
        });
    }
}