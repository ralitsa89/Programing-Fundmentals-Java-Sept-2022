package P13ListsLab;

import java.util.*;

import static java.lang.System.in;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String products = scanner.nextLine();

            productList.add(products);
        }
        Collections.sort(productList);

        for (int i = 0; i < productList.size(); i++) {
            System.out.println(i + 1 + "." + productList.get(i));
        }
    }
}
