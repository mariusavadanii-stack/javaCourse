package J;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatorApp {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu(bufferedReader);
    }

    public static void menu(BufferedReader bufferedReader) {
        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Exit");

            int choice = takeInput(bufferedReader, "Choose an option (1-5):");

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                System.exit(0);
            }

            int num1 = takeInput(bufferedReader, "Enter first number:");
            int num2 = takeInput(bufferedReader, "Enter second number:");

            switch (choice) {
                case 1 -> System.out.println("Result: " + (num1 + num2));
                case 2 -> System.out.println("Result: " + (num1 - num2));
                case 3 -> System.out.println("Result: " + (num1 * num2));
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                }
                default -> System.out.println("Invalid choice. Please select between 1 and 5.");
            }
        }
    }

    private static int takeInput(BufferedReader bufferedReader, String question) {
        System.out.println(question);
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
            return takeInput(bufferedReader, question);
        }
    }
}