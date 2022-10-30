package P15P09MoreExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        List<Character> numbers = new ArrayList<>();
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 48 && input.charAt(i) <= 57) {
                numbers.add(input.charAt(i));
            } else {
                characters.add(input.charAt(i));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int numToAdd = Character.getNumericValue(numbers.get(i));
            if (i % 2 == 0) {
                takeList.add(numToAdd);
            } else {
                skipList.add(numToAdd);
            }
        }
        int index = 0;
        String result = "";
        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            int skip = skipList.get(i);
            if(index + take > characters.size()){
                take = characters.size() - index;
                for (int j = 0; j < take; j++) {
                    result += characters.get(index + j);
                }
                index += take + skip;
            }
        }
        System.out.println(result);
    }
}
