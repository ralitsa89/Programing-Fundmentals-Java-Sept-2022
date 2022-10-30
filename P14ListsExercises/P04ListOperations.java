package P14ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String operations = scanner.nextLine();
        while (!operations.equals("End")) {
            String[] operationArr = operations.split(" ");
            switch (operationArr[0]) {
                case "Add":
                    int numToAdd = Integer.parseInt(operationArr[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Insert":
                    int numbToInsert = Integer.parseInt(operations.split("\\s+")[1]);
                    int index = Integer.parseInt(operations.split("\\s+")[2]);
                    if (isValidIndex(index, numbersList)) {
                        numbersList.add(index, numbToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(operations.split("\\s+")[1]);
                    if (isValidIndex(indexToRemove, numbersList)) {
                        numbersList.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (operationArr[1].equals("left")) {
                        int countLeft = Integer.parseInt(operationArr[2]);
                        for (int i = 1; i <= countLeft; i++) {
                            int firstNumbOfList = numbersList.get(0);
                            numbersList.remove(0);
                            numbersList.add(firstNumbOfList);
                        }
                    } else if (operationArr[1].equals("right")) {
                        int countRight = Integer.parseInt(operationArr[2]);
                        for (int i = 1; i <= countRight; i++) {
                            int lastNumOfList = numbersList.get(numbersList.size() - 1);
                            numbersList.remove(numbersList.size() - 1);
                            numbersList.add(0, lastNumOfList);
                        }
                    }
                    break;
            }
            operations = scanner.nextLine();
        }
        for (int num : numbersList) {
            System.out.print(num + " ");
        }
    }
    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
