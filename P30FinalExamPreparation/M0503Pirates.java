package P31Test;

import java.util.*;

import static java.lang.System.in;

public class M0503Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();

        String[] cities = scanner.nextLine().split("\\|\\|");
        while (!cities[0].equals("Sail")) {
            int population = Integer.parseInt(cities[1]);
            int gold = Integer.parseInt(cities[2]);

            if(citiesMap.containsKey(cities[0])){
                int existingPeople = citiesMap.get(cities[0]).get(0);
                int existingGold = citiesMap.get(cities[0]).get(1);

                citiesMap.get(cities[0]).set(0, population + existingPeople);
                citiesMap.get(cities[0]).set(1, gold + existingGold);
            }else{
                citiesMap.put(cities[0], new ArrayList<>());
                citiesMap.get(cities[0]).add(0, population);
                citiesMap.get(cities[0]).add(1, gold);
            }

            cities = scanner.nextLine().split("\\|\\|");
        }

        String[] inputLine = scanner.nextLine().split("=>");
        while (!inputLine[0].equals("End")) {
            switch (inputLine[0]) {
                case "Plunder":
                    String town = inputLine[1];
                    int people = Integer.parseInt(inputLine[2]);
                    int gold = Integer.parseInt(inputLine[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                    int population = citiesMap.get(town).get(0);
                    int currentGold = citiesMap.get(town).get(1);

                    citiesMap.get(town).set(0, population - people);
                    citiesMap.get(town).set(1, currentGold - gold);

                    int checkPeople = citiesMap.get(town).get(0);
                    int checkGold = citiesMap.get(town).get(1);
                    if(checkPeople <= 0 || checkGold <= 0){
                        citiesMap.remove(town);
                        System.out.println(town + " has been wiped off the map!");
                    }
                    break;
                case "Prosper":
                    String thisTown = inputLine[1];
                    int newGold = Integer.parseInt(inputLine[2]);
                    currentGold = citiesMap.get(thisTown).get(1);

                    if(newGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    }else{
                        citiesMap.get(thisTown).set(1, currentGold + newGold);
                        int currentGoldPrint = citiesMap.get(thisTown).get(1);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", newGold, thisTown, currentGoldPrint);
                    }
                    break;
            }

            inputLine = scanner.nextLine().split("=>");
        }
        if(citiesMap.size() == 0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", citiesMap.size());

            citiesMap.forEach((k,v) ->{
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", k, v.get(0), v.get(1));
            });
        }
    }
}
