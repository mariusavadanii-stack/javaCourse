package A;


/*array lists are containers of values, collection interface is multiple values, multiple names, multiple values*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class M_ArrayLists {

    static void main(String[] args) {


        /*<> diamond , has to be a reference type(instances of a class), they can not have primitives*/
        /*() is the constructor method, usually is empty and e fill it */
        ArrayList<String> foodItems = new ArrayList<>();
        foodItems.add("spaghetti");
        foodItems.add("steak");
        foodItems.add("fries");
        foodItems.add("salad");

        /*raw print*/
        System.out.println(foodItems);

        /*add in a specific position*/
        foodItems.add(2,"apples");
        System.out.println(foodItems);

        /*set() replace an element with another element*/
        foodItems.set(4,"grappa");
        System.out.println(foodItems);

        /*get an element NO SQUARE BRACKETS*/
        System.out.println(foodItems.get(3));

        /*remove() to remove*/
        foodItems.remove(4);
        System.out.println(foodItems);

        /*remove all elements*/
        //foodItems.clear();

        /*loop inside with for*/
        for (int i = 0; i < foodItems.size();i++) {
            System.out.println("Element number " + (i+1) + " -> " + foodItems.get(i));
        }
        /*unsorted version -> order of insertion*/

        for (String foodItem: foodItems ) {
            System.out.println(foodItem);
        }
        Collections.sort(foodItems);
        for (String foodItem: foodItems ) {
            System.out.println(foodItem);
        }

        /*arrayList of Int*/
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(67);
        numbers.add(7);
        numbers.add(12);

        Collections.sort(numbers); /*sort*/
        Collections.reverse(numbers); /*reverse*/
        for(int number : numbers){
            System.out.println(number);
        }

        /*binarySearch for searching elements inside ArrayLists */
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(23.67);
        doubles.add(99.97);
        doubles.add(12.33);

        /*we HAVE TO it to use binarySearch*/
        Collections.sort(doubles);
        System.out.println(Collections.binarySearch(doubles,99.97));











    }

}
