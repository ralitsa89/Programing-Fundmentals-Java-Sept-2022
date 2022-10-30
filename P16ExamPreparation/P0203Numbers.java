package P16ExamPreparation;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P0203Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        double sum = 0;
        for (int num : numbersList) {
            sum += num;
        }
        sum = sum / numbersList.size();

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            int element = numbersList.get(i);
            if (sum < element) {
                newList.add(element);
            }
        }
        List<Integer> topFive = new ArrayList<>();

        for (int currentNum : newList) {
            if(currentNum > sum){
                topFive.add(currentNum);
            }
        }
        if(topFive.isEmpty()){
            System.out.println("No");
        } else if (topFive.size() < 5) {
            for (int num : topFive) {
                System.out.printf("%d ", num);
            }
        }else{
            topFive = topFive.stream().limit(5).collect(Collectors.toList());
            for (Integer number : topFive) {
                System.out.printf("%d ", number);
            }
        }
    }
}
