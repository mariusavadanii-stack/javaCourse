package A;

public class F_Strings {

    static void main(String[] args) {

        /* PLUS AMBIGUITY*/
        int a = 5;
        int b = 9;
        System.out.println(a+b);
        String stringA = "5";
        String stringB = "9";
        System.out.println(stringA + stringB);

        /*check a string value*/
        String word = "Ciao";

        if (word.equalsIgnoreCase("ciao")){
            System.out.println("it's ciao");
        } else {
            System.out.printf("not ciao");}

        /*how to create a constant - -> varible with a fix value*/

        final int NUMBER_OF_MONTHS = 12;
        System.out.println("months: "  + NUMBER_OF_MONTHS);

    }
}
