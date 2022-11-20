package P20AssociativeArraysLab;

import java.util.*;

import static java.lang.System.in;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String word : inputArr) {
            word = word.toLowerCase();

            wordsMap.putIfAbsent(word, 0);
            wordsMap.put(word, wordsMap.get(word) + 1);

//            if(!wordsMap.containsKey(word)){
//                wordsMap.put(word, 0);
//            }
//            wordsMap.put(word, wordsMap.get(word) + 1);
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if(entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}