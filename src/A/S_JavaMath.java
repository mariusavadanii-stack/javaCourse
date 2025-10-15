package A;

public class S_JavaMath {

    static void main(String[] args) {

        /*java math is a Helper Class - usually contains random unrelated methods tat can be used in a application */
        /*static methods belongs to a class and is called from a class ex: Collections.sort() - check capital letter*/
        /*instance methods called by an object ex: numbers.add(44);*/

        int a = 9;
        int b = 4;
        double c = 34.78;
        double d = 67.12;

        /*find the bigger value between 2*/

        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(a));

        /*power of*/
        System.out.println(Math.pow(a,3));

        /*ceil closet approx higher value*/
        System.out.println(Math.ceil(d));

        /*floor closet approx lower*/
        System.out.println(Math.floor(d));

        /*round*/
        System.out.println(Math.round(d));

        /*random*/
        System.out.println(Math.random());

        /*random between 1 and 10*/
        System.out.println((int)(Math.random()*10) +1);



    }

}
