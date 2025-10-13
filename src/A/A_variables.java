package A;

public class A_variables {

    static void main(String[] args) {

        System.out.println("hello world");
        System.out.println("ciao");

        // Variables - primitive
        // INT BYTE SHORT LONG
        // declaration and setting a value
         int firstInt;      //declaration
         firstInt = 18;     //setting value

        int secondInt = 45;
        System.out.println(secondInt);
        System.out.println(firstInt);

        //small value like smaller than 100
        byte firstByte = 78;
        System.out.println(firstByte);

        // short is a short int long
        short firstShort = 30333;
        long firstLong  = 222225033;

        //mix strings with parsed values

        System.out.println("my first " + firstByte +  "and my second" +secondInt);

/* float boolean char*/

        float firstFloat = 23.56f;
        double firstDouble = 456.789;
        boolean firstBoolean = true;
        char firstChar = 'd';   // single character

        /*Wrapper classes =*/
        int maximumIntValue = Integer.MAX_VALUE; /* get of a property*/
        System.out.println("the max " + maximumIntValue);

    /*casting = give a variable a type or change that type*/
        /*widening*/
        int smallInt = 20;
        double smallDouble = smallInt;
        System.out.println(smallDouble);
        /*narrowing*/
        double anotherDouble = 345.789;
        int anotherInt = (int) anotherDouble; /*forcing casting*/
        System.out.println(anotherInt);








    }

}
