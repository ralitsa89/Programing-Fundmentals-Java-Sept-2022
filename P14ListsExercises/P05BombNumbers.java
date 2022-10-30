package P14ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> mainList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");

        String bombNum = data[0];
        int power = Integer.parseInt(data[1]);
        int sum = 0;

        while (mainList.contains(bombNum)){
            int bombIndex = mainList.indexOf(bombNum);

            int left = Math.max(0, bombIndex - power);
            int right = Math.min(bombIndex + power, mainList.size() - 1);

            for (int i = right; i >= left ; i--) {
                mainList.remove(i);
            }
        }
        System.out.println(mainList.stream().mapToInt(Integer::parseInt).sum());
    }
}
