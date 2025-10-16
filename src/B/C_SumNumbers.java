package B;

import java.util.Scanner;

public class C_SumNumbers {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        sumNumbers(scanner); /*call the function*/

    }

    private static void sumNumbers (Scanner scanner){

        int first = takeInput(scanner, "insert first number");
        int second = takeInput(scanner, "insert second number");
        int sum = first + second;

        System.out.println("the sum of " + first + " + " + second  + " is " + sum);

    }

    private static int takeInput(Scanner scanner, String question){
        System.out.println(question);
        return scanner.nextInt();
    }

} /*end class*/
