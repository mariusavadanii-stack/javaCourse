package C;

public class Moto {
    /*pojo - Plain old java object -> properties, constructor, methos*/

    private String brand;
    private String model;
    private int cc;
    private boolean engineOn = false;
    private double fuel = 0;


    public Moto(String brand, String model, int cc) {
        this.brand = brand;
        this.model = model;
        this.cc = cc;
    }
    public void view(){
        System.out.println("this moto is a" + brand + " " + model + " and the engine is a " + cc + "cubic centimeters" );
    }
    public void start(){
        if (!engineOn){
            engineOn = true;
            System.out.println("the moto is on! have fun");
        }
    }
    public void ride(int kms){
        if (engineOn && fuel>0){
            fuel -= kms*0.1;
            System.out.println("you just drove " + kms + "kms and your fuel is now at " + fuel + "liters" );
        } else {
            System.out.println("you need to start the mot and/or fill the tank");
        }
    }
    public  void fillUpTank(double amountOfFuel) {
        fuel += amountOfFuel;
        System.out.println("your tank now has " + fuel + " liters of gas");

    }
}/*class end*/









