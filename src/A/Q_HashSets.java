package A;

import java.util.HashSet;

public class Q_HashSets {
    static void main(String[] args) {

        /*basically arraylist but UNIQUE retrieval*/

        HashSet<String> people = new HashSet<>();
        people.add("paul");
        people.add("paul");
        people.add("john");
        people.add("george");
        people.add("george");
        people.add("ringo");

        System.out.println(people);

        /*this will remove every "geroge"*/
        people.remove("george");
        System.out.println(people);

        /*search inside*/
        System.out.println(people.contains("paul"));
        System.out.println(people.contains("marco"));

        for (String person : people){
            System.out.println(person);
        }



    }
}
