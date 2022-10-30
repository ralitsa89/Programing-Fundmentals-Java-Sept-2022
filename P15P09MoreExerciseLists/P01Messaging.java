package P15P09MoreExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> string = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        String output = "";
        for (int i = 0; i < numbersList.size(); i++) {
            int sum = 0;
            int firstElement = numbersList.get(i);
            while (firstElement > 0) {
                sum += firstElement % 10;
                firstElement = firstElement / 10;
            }
            if(sum > string.size()){
                int index = sum - string.size();
                output += string.get(index);
                string.remove(index);
            }else{
                output += string.get(sum);
                string.remove(sum);
            }
        }
        System.out.println(output);
    }
}
