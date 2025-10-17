package H;

public class Main {

    static void main(String[] args) {
        Cat firstCat = new Cat("chip", "red", 4);
        Cat secondCat = new Cat("chop", "black", 5);
        Cat thirdCat = new Cat("ciccio", "mixed", 2);

        thirdCat.meow();
        System.out.println(Cat.getNumberOfCats());



    }

}
