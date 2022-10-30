package P14ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] commandArr = input.split(" ");
            switch (commandArr[0]){
                case "Delete":
                    int numForRemove = Integer.parseInt(commandArr[1]);
                    numbersList.removeAll(Arrays.asList(numForRemove));
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    numbersList.add(index, element);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
