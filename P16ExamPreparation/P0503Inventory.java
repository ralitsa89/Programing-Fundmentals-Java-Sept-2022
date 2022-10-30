package P16ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P0503Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> inventoryList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Craft!")){
            String[] commandsLine = inputLine.split(" - ");
            String command = commandsLine[0];
            switch (command){
                case "Collect":
                    String addItem = commandsLine[1];
                    if(!inventoryList.contains(addItem)){
                        inventoryList.add(addItem);
                    }
                    break;
                case "Drop":
                    String removeItem = commandsLine[1];
                        inventoryList.remove(removeItem);
                    break;
                case "Combine Items":
                    String[] item = commandsLine[1].split(":");
                    String oldItem = item[0];
                    String newItem = item[1];
                    if (inventoryList.contains(oldItem)) {
                        int indexOldItem = inventoryList.indexOf(oldItem);
                        inventoryList.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String renewItem = commandsLine[1];
                    if (inventoryList.contains(renewItem)) {
                        inventoryList.remove(renewItem);
                        inventoryList.add(renewItem);
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventoryList));
    }
}
