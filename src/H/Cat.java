package H;

public class Cat {


    private String name;
    private String color;
    private int age;
    private static int numberOfCats;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        numberOfCats ++;
    }

    /*this is a getter*/
    public static int getNumberOfCats() {
        return numberOfCats;
    }

    public void meow() {
        System.out.println("meoowww");
    }

}



