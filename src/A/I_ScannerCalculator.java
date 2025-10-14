package A;

import java.util.Scanner;

public class I_ScannerCalculator {
    static void main(String[] args) {

        /*scanner is a helper class  -> if we are using one instance of a class we are using the default name - the same name of a class without capital*/

        Scanner scanner = new Scanner(System.in);

        System.out.println(" insert first: ");
        int firstInt = scanner.nextInt();

        System.out.println(" insert second: ");
        int secondInt = scanner.nextInt();

        System.out.println("Choose the operation: \n 1 for sum\n 2 for substraction\n 3 for multiplication\n 4 for divition ");

        int operation = scanner.nextInt();

        int result = 0;
        switch  (operation) {
            case 1-> result = firstInt + secondInt;
            case 2-> result = firstInt - secondInt;
            case 3-> result = firstInt * secondInt;
            case 4-> result = firstInt / secondInt;
        }
        System.out.println("the result is :" + result);




    }

}
