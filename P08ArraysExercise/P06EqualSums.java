package P08ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound = false;
        for (int index = 0; index <= array.length - 1 ; index++) {
           int currentElement = array[index];
           int leftSum = 0;
           int rightSum = 0;
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {  //from 0 index to current index
                leftSum += array[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex <= array.length - 1; rightIndex++) {  // from current index to last index
                rightSum += array[rightIndex];
            }
            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
