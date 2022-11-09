package P21MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numbOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingUsers = new LinkedHashMap<>();

        for (int i = 0; i < numbOfCommands; i++) {
            String commands = scanner.nextLine();
            String[] splitArr = commands.split(" ");
            String command = splitArr[0];
            String username = splitArr[1];


            if(command.equals("register")){
                String number = splitArr[2];
                if(!parkingUsers.containsKey(username) ){
                    parkingUsers.put(username, number);
                    System.out.printf("%s registered %s successfully%n", username, number);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n", number);
                }

            } else if (command.equals("unregister")) {

                if(!parkingUsers.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n", username);
                }else {
                    parkingUsers.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        parkingUsers.forEach((userName, number) -> System.out.println(userName + " => " + number));
    }
}
