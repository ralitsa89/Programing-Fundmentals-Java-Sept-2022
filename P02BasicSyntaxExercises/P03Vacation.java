package P02BasicSyntaxExercises;

import java.util.Scanner;

import static java.lang.System.in;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numbPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (groupType.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = 8.45 * numbPeople;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 9.80 * numbPeople;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 10.46 * numbPeople;
            }
            if (numbPeople >= 30) {
                price = price - (price * 0.15);
            }
        } else if (groupType.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                price = 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 16;
            }
            if(numbPeople >= 100){
                numbPeople = numbPeople - 10;
                price = numbPeople * price;
            }else {
                price = price * numbPeople;
            }
        } else if (groupType.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                price = 15 * numbPeople;
            } else if (dayOfWeek.equals("Saturday")) {
                price = 20 * numbPeople;
            } else if (dayOfWeek.equals("Sunday")) {
                price = 22.50 * numbPeople;
            }
            if(numbPeople >= 10 && numbPeople <= 20){
                price = price - (price * 0.05);
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
