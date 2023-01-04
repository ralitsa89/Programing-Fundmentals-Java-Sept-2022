package P31Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class M0302MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        String regex = "([@|#])(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> pairsList = new ArrayList<>();
        int count = 0;
        while (matcher.find()){
            String word1 = matcher.group("first");
            String word2 = matcher.group("second");
            count++;

            String reversed = "";
            for (int i = word2.length() - 1; i >= 0 ; i--) {
                char currentChar = word2.charAt(i);
                reversed += currentChar;
            }
            if(word1.equals(reversed)){
                pairsList.add(word1 + " <=> " + word2);
            }
        }
        if(count > 0){
            System.out.println(count + " word pairs found!");
        }else {
            System.out.println("No word pairs found!");
        }
        if(pairsList.size() > 0){
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", pairsList));
        }else {
            System.out.println("No mirror words!");
        }
    }
}
