package A;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class O_HashMapSorting {

    static void main(String[] args) {

        HashMap<Integer, String> people = new HashMap<>();
        people.put(23,"bubu");
        people.put(99,"mama");
        people.put(3,"papa");
        people.put(74,"cici");
        people.put(1,"baba");

        for (int key : people.keySet()){
            System.out.println(key + " , " + people.get(key));
        }

        /*create a treemap based on this HashMap*/
        /*passing the HashMap into a TreeMap by using argument 'people'*/
        TreeMap<Integer,String> peopleTreemap = new TreeMap<>(people);
        /*use the Iterator class on the treemap*/
        /*TreeMap is naturaly sorted and HasMap can not be sorted*/
        Iterator<Integer> iterator = peopleTreemap.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println("key: " + key + ", value: " + people.get(key));
        }

    }

}
