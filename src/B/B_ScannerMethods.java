package B;

import java.util.Scanner;

public class B_ScannerMethods {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = takeInput(scanner, "insert first input: ");
        int secondNumber = takeInput(scanner, "insert second input: ");

        int sum = firstNumber + secondNumber;
        System.out.println("result is: " + sum);

    }

    private static int takeInput(Scanner scanner, String question){
        System.out.println(question);
        return scanner.nextInt();
    }

}
