package A;

public class D_IfElse {

    static void main(String[] args) {

        int number = 3;

        if (number > 5) {
            System.out.println("it's bigger");
        } else {
            System.out.println("equal or smaller");
        }

        boolean ciao = true;
        if (ciao) {
            System.out.println("it's ciao");
        } else {
            System.out.println("not ciao");
        }
    int a = 10;
    int b = 5;
    /*logical and -> all conditions must be true to return true*/
        if (a>9 && b>10){
            System.out.println("all true");
        } else {
            System.out.println("one or all are fasle");
        }

        int c = 10;
        int d = 5;
        /*logical and -> all conditions must be true to return true*/
        if (c>9 || d>10){
            System.out.println("some or all are true");
        } else {
            System.out.println("all are fasle");
        }

        /*ternary operator*/
        int userAge = 20;
        boolean ofAge = userAge > 18 ? true:false;
        if (ofAge) {
            System.out.println("come inside");
        } else {
            System.out.println("get out");}

        /*another example*/

        int price = 100;
        String discount = "low";
        int discountFactor = discount == "low" ? 10:35;
        int finalPrice = price - (price /100 * discountFactor);
        System.out.println("final price is " + finalPrice);


    }
}
