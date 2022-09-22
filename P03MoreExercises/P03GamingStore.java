package P03MoreExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double remainingBalance = 0;

        String command = scanner.nextLine();
        while (!command.equals("Game Time")) {

            double price = 0;
            switch (command) {
                case "OutFall 4":
                    price = 39.99;
                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                        remainingBalance += price;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                        remainingBalance += price;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                        remainingBalance += price;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                        remainingBalance += price;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                        remainingBalance += price;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (currentBalance >= price) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= price;
                        remainingBalance += price;
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }
            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",remainingBalance , currentBalance);
    }
}
