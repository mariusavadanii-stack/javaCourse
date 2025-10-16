package B;

import java.util.ArrayList;
import java.util.Scanner;

public class D_dynamicMethods {

    static void main(String[] args) {

        /*sum of x numbers*/
        /*the user will tell us how many numbers they want to sum*/

        Scanner scanner = new Scanner(System.in);
        sumMultipleValues(scanner);

    }

    private static void sumMultipleValues (Scanner scanner){
        int howManyValues = takeInput(scanner,"how many number do you want to sum ? " );
        int sum = 0;
        int input = 0;
        ArrayList<Integer> numbersList = new ArrayList<>();
        for ( int i = 0; i< howManyValues; i++){
            input = takeInput(scanner," insert the " + (i+1) + "number ");
            numbersList.add(input);
            sum += input;
        }
        System.out.println("You have inserted : ");

        for (int singleNumber : numbersList){
            System.out.print(singleNumber + " & ");
        }
        System.out.println("and the sum of all your number is " + sum);
    }

    private static int takeInput(Scanner scanner, String question){
        System.out.println(question);
        return scanner.nextInt();
    }

}
