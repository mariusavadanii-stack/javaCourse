package A;

import java.util.LinkedList;

public class P_LinkedLists {

    static void main(String[] args) {

        /*Arraylist quick on read, slow on modify (add, remove, set)*/
        /*Linkedlist quick on modify, slow to read*/
        LinkedList<String> things = new LinkedList<>();
        things.add("mouse");
        things.add("pc");
        things.add("mug");
        things.add("pen");

        things.add(2,"phone");
        things.set(4,"watch");
        System.out.println(things);

        things.addFirst("photoframe");
        things.addLast("toycar");
        System.out.println(things);
        System.out.println(things.get(4));
        System.out.println(things.getFirst());
        System.out.println(things.getLast());

        things.remove(1);
        things.removeFirst();
        things.removeLast();
        System.out.println(things);



    }
}
