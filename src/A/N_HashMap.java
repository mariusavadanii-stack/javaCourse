package A;

import java.util.HashMap;

public class N_HashMap {

    static void main(String[] args) {

        /*a map can be multidimensional, a list is unidimensional, one dimension - one name -> multiple values, multiple diminutions you can choose the name and have multiple values*/

        HashMap<String,String> actions = new HashMap<>();
        /*method for inserting is put*/
        actions.put("I'm hungry", "I eat");
        actions.put("I'm thirsty", "I drink");
        actions.put("I'm cold", "I put on more clothes");
        actions.put("I'm tired", "I sleep");

        /*raw print */
        System.out.println(actions);

        /*print a set of keys*/
        System.out.println(actions.keySet());

        /*print value only*/
        System.out.println(actions.values());

        /*key/value mapping*/
        System.out.println(actions.entrySet());

        /*to access values, I pass the key to a get() method*/
        System.out.println(actions.get("I'm tired"));

        /*remove a pair by passing the key to remove()*/
        actions.remove("I'm tired");
        System.out.println(actions);

        /*for dimentions, like arraylist, we use size()*/
        System.out.println(actions.size());

        /*for each on keys*/
        for (String value : actions.values()){
            System.out.println(value);
        }

        for (String key : actions.keySet()){
            System.out.printf("Key: " + key + "' Value: " + actions.get(key));
        }

        HashMap<Integer, String> thedoors = new HashMap<>();
        thedoors.put(1,"Jim");
        thedoors.put(2,"Ray");
        thedoors.put(3,"John");
        thedoors.put(4,"Robbie");

        for (int key : thedoors.keySet()){
            System.out.println(key + " : " + thedoors.get(key));
        }
        /*search inside HashMap*/
        System.out.println(thedoors.containsKey(3));
        System.out.println(thedoors.containsKey(9));
        System.out.println(thedoors.containsValue("Jim"));
        System.out.println(thedoors.containsValue("Mario"));

        if (thedoors.containsValue("Jim")){
            System.out.println("Jim is here");
        }else {
            System.out.println("Jim left the building");
        }

        if (thedoors.containsValue("Mario")){
            System.out.println("Mario is here");
        }else {
            System.out.println("Mario left the building");
        }

        if (thedoors.containsKey(4)){
            System.out.println("i found it! it's " + thedoors.get(4));
        } else {
            System.out.println("that dude left the building");
        }



    }

}
