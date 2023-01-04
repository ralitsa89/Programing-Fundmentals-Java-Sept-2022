package P31Test;

import java.util.*;

import static java.lang.System.in;

public class M0303NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] inputCars = scanner.nextLine().split("\\|");
            String car = inputCars[0];
            int mileage = Integer.parseInt(inputCars[1]);
            int fuel = Integer.parseInt(inputCars[2]);

            List<Integer> carsInfo = new ArrayList<>();
            carsInfo.add(mileage);
            carsInfo.add(fuel);
            carsMap.put(car, carsInfo);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("Stop")) {
            String command = commands.split(" : ")[0];
            String givenCar = commands.split(" : ")[1];

            int mileage = carsMap.get(givenCar).get(0);
            int fuel = carsMap.get(givenCar).get(1);

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(commands.split(" : ")[2]);
                    int consumedFuel = Integer.parseInt(commands.split(" : ")[3]);

                    if (fuel >= consumedFuel) {
                        carsMap.get(givenCar).set(0, mileage + distance);
                        carsMap.get(givenCar).set(1, fuel - consumedFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", givenCar, distance, consumedFuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    if (mileage + distance >= 100000) {
                        carsMap.remove(givenCar);
                        System.out.printf("Time to sell the %s!%n", givenCar);
                    }
                    break;
                case "Refuel":
                    int givenFuel = Integer.parseInt(commands.split(" : ")[2]);

                    int totalFuel = givenFuel + fuel;
                    int difference = 0;
                    if (givenFuel + fuel > 75) {
                        difference = 75 - fuel;
                        totalFuel = 75;
                    } else {
                        difference = givenFuel;
                    }
                    carsMap.get(givenCar).set(1, totalFuel);
                    System.out.printf("%s refueled with %d liters%n", givenCar, difference);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commands.split(" : ")[2]);
                    carsMap.get(givenCar).set(0, mileage - kilometers);

                    if (carsMap.get(givenCar).get(0) < 10000) {
                        carsMap.get(givenCar).set(0, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", givenCar, kilometers);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        carsMap.forEach((k, v) -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", k, v.get(0), v.get(1));
        });
    }
}
