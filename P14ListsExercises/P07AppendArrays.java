package P14ListsExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(listSeparatedByPipe);

        System.out.println(listSeparatedByPipe.toString().replace("[", "").
                replace("]", "").trim().replaceAll(",", "").replaceAll("\\s+", " "));
    }
}
