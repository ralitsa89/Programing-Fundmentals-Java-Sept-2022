package P31Test;

import java.util.*;

import static java.lang.System.in;

public class M0203PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantAndRarityMap = new LinkedHashMap<>();
        Map<String, Double> ratingMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);

            plantAndRarityMap.put(plant, rarity);
            ratingMap.put(plant, 0.0);
        }

        String[] commands = scanner.nextLine().split(": ");
        while (!commands[0].equals("Exhibition")) {
            String plant = commands[1].split(" - ")[0];

            if (!plantAndRarityMap.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (commands[0]) {
                    case "Rate":
                        double rating = Double.parseDouble(commands[1].split(" - ")[1]);
                        if (ratingMap.get(plant) == 0) {
                            ratingMap.put(plant, rating);
                        } else {
                            double newRating = (ratingMap.get(plant) + rating) / 2;    ///!!!!
                            ratingMap.put(plant, newRating);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(commands[1].split(" - ")[1]);
                        plantAndRarityMap.put(plant, newRarity);
                        break;
                    case "Reset":
                        ratingMap.put(plant, 0.0);
                        break;
                }
            }
            commands = scanner.nextLine().split(": ");
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> e : plantAndRarityMap.entrySet()) {                                                 //!!!!
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(), ratingMap.get(e.getKey()));
        }
    }
}
