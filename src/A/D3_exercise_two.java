

package A;

import java.util.HashMap;

public class D3_exercise_two {

    static void main(String[] args) {

        HashMap<String, Double> products = new HashMap<>();
        products.put("bread", 1.2);
        products.put("milk", 1.5);
        products.put("eggs", 3.0);

        System.out.println("initial  products list: " + products);

        products.replace("milk", 1.7);
        products.remove("bread");
        System.out.println("updated products list: " + products);

        double sum = 0.0;
        for (double price : products.values()){
            sum += price;
        }
        System.out.println("price of remaining products: " + sum + " $ " );

    }

}
