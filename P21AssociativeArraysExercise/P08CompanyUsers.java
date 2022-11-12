package P21AssociativeArraysExercise;

import java.util.*;

import static java.lang.System.in;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> companies = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];
            if (!companies.containsKey(companyName)) {
                companies.put(companyName, new ArrayList<>());
                companies.get(companyName).add(id);
            } else {
                if (!companies.get(companyName).contains(id)) {
                    companies.get(companyName).add(id);
                }
            }
            input = scanner.nextLine();
        }
        companies.entrySet().forEach(companyName -> {
                    System.out.println(companyName.getKey());
                    companyName.getValue().forEach(employee -> System.out.println("-- " + employee));
                });
    }
}
