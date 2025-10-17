package I;

public class Rhino extends Animal {

    private int hornSize;
    private int breathHoldingCapacity;

    public Rhino(String name, String kind, int age, int weight, int hornSize, int breathHoldingCapacity) {
        super(name, kind, age, weight);
        this.hornSize = hornSize;
        this.breathHoldingCapacity = breathHoldingCapacity;

    }

    public void charge() {
        System.out.println(name + " is charging RUN");
    }
    /*Override in when a child class Redefines a super class method, specializing it*/
    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("grass")){
            System.out.println("the rhino is eating grass happily");
        } else {
            System.out.println(food + " is not what rhinos eat! give me grass");
        }
    }
} /*end class*/
