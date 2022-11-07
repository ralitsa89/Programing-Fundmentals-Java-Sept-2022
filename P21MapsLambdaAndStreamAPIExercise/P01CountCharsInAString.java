package P21MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
//            if(symbol == ' '){
//                continue;
//            }
            if(!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol, 1);
            }else {
                int currentSymbol = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentSymbol + 1);
            }
        }
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
