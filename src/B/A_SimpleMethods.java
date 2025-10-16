package B;

public class A_SimpleMethods {
    static void main(String[] args) {

        /*method is a function inside a class*/
        sumNumbers(5,7);
        sumNumbers(13,67);
        sumNumbers(33,66);

        System.out.println(sumWithReturn(345,89));

        int exampleSum = sumWithReturn(5,2);
        if (exampleSum > 5){
            System.out.println(exampleSum);
        } else {
            System.out.println("grow bigger");
        }

    } /*end maine*/
    /*this is where methodes live*/
    /*access modifieier/NON-access mofiier/return type/ MethondName(paramaters) {code}*/
    private static void sumNumbers (int a, int b) {
        int result = a + b;
        System.out.println(result);
        /*access modifier - "private"  - establish the level of access to that resource*/
        /*Non-access modifier - "static" -> this method belong to class not the instance*/
        /*if the subject of your phrase is capital -> instance method*/
        /*"void" -method with output but without return */


    }
    private static int sumWithReturn (int a, int b){
        /*return means that parsing this method will reutn this value */
        int result = a + b;
        return result;


    }
} /*end class*/
