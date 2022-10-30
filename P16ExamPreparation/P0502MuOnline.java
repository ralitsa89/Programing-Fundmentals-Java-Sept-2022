package P16ExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class P0502MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] inputArr = scanner.nextLine().split("\\|");

        int health = 100;
        int lastNumber = 0;
        int bitcoins = 0;

        for (int i = 0; i < inputArr.length; i++) {
            String input = inputArr[i];
            String[] element = input.split(" ");
            String command = element[0];
            int number = Integer.parseInt(element[1]);

            if (command.equals("potion")) {

                int currentHealth = health;
                health = currentHealth + number;
                if (health > 100) {
                    health = 100;
                }
                if (health < 100) {
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                } else if (health == 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - currentHealth);
                    System.out.printf("Current health: %d hp.%n", health);
                }

            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    break;
                }
            }
        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
