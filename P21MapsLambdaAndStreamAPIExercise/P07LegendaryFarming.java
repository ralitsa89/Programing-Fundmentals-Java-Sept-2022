package P21MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");
            for (int i = 0; i <= inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String material = inputData[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        int current = junk.get(material);
                        junk.put(material, current + quantity);
                    }
                }
                if(items.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if(isWin){
                break;
            }
        }
        items.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
