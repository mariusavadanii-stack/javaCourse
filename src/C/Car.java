package C;

public class Car {
    /*pure class only has properties and methods NO MAIN METHOD*/
    /*what is a car, what does a car do*/
    /*1 property*/
    /*private - encapsulated properties, can not be modified unless it's allowed  we don't want other classes to access these properties */

    private String brand;
    private String model;
    private int cc;

    /*Constructor -> method that creates instances*/
    /*Alt+Insert opens code generate - Select Contructor*/

    /*contructeor needs to be public to be accessed from the out side, like main method*/
    public Car(String brand, String model, int cc) {
        this.brand = brand;
        this.model = model;
        this.cc = cc;
    }
    /*visulize all properties of the car*/
    public void view(){
        System.out.println("this car is a" + brand + " " + model + " and the engone is a " + cc + "cubic centimeters" );
    }
    public void  start(){
        System.out.println("car is on now");
    }

    public void calculateCost(int amountOfKm){
        double cost = (double) (cc * amountOfKm) / 100;
        System.out.println("you will spend $" +cost);

    }
} /*end class*/
