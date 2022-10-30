package P16ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P0402ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];
            String item = commands[1];

            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = commands[2];
                    if (shoppingList.contains(item)) {
                        int oldItem = shoppingList.indexOf(item);
                        shoppingList.set(oldItem, newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            if (i == shoppingList.size() - 1) {
                System.out.print(shoppingList.get(i));
            } else {
                System.out.print(shoppingList.get(i) + ", ");
            }
        }
    }
}
