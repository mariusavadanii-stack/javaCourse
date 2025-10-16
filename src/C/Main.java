package C;

public class Main {
    static void main(String[] args) {
        /*here we create instances of a car*/

        Car firstCar = new Car("Fiat", "Panda", 1000);
        Car secondCar = new Car("BWM", "x5", 2500);
        firstCar.view();
        secondCar.view();
        firstCar.start();
        firstCar.calculateCost(200);
        Moto firstMoto = new Moto("harley", "fatbob",1989);
        firstMoto.view();
        firstMoto.start();
        firstMoto.fillUpTank(50);
        firstMoto.ride(200);

    }


}
