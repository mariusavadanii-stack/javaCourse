package I;

public class Animal {

    /*protected is used to give access to subclasses*/
    protected String name;
    private String kind;
    private int age;
    private int weight;

    public Animal(String name, String kind, int age, int weight) {
        this.name = name;
        this.kind = kind;
        this.age = age;
        this.weight = weight;

    }

    public void eat(String food) {
        System.out.println("the animal is eating " + food);
    }
    public void run(){
        System.out.println("the animal is running");
    }

}
