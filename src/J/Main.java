package J;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();
        menu(bufferedReader, calculator);
    } // end main

    private static int takeInput(BufferedReader bufferedReader, String question) {
        System.out.println(question);
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("Please insert an integer.");
            return takeInput(bufferedReader, "Try again: ");
        }
    }

    public static void menu(BufferedReader bufferedReader, Calculator calculator) {
        while (true) {
            System.out.println();
            int menuChoice = takeInput(bufferedReader, "Calculator Menu: \n1) Add\n2) Subtract\n3) Multiply\n4) Divide\n5) Exit");
            switch (menuChoice) {
                case 1 -> performOperation(bufferedReader, calculator, "add");
                case 2 -> performOperation(bufferedReader, calculator, "subtract");
                case 3 -> performOperation(bufferedReader, calculator, "multiply");
                case 4 -> performOperation(bufferedReader, calculator, "divide");
                case 5 -> System.exit(0);
                default -> System.out.println("Please choose a valid option between 1 and 5.");
            }
        }
    }

    private static void performOperation(BufferedReader bufferedReader, Calculator calculator, String operation) {
        double num1 = takeInputDouble(bufferedReader, "Enter the first number: ");
        double num2 = takeInputDouble(bufferedReader, "Enter the second number: ");

        switch (operation) {
            case "add" -> System.out.println("Result: " + calculator.add(num1, num2));
            case "subtract" -> System.out.println("Result: " + calculator.subtract(num1, num2));
            case "multiply" -> System.out.println("Result: " + calculator.multiply(num1, num2));
            case "divide" -> {
                double result = calculator.divide(num1, num2);
                if (result != Double.NaN) {
                    System.out.println("Result: " + result);
                }
            }
        }
    }

    private static double takeInputDouble(BufferedReader bufferedReader, String question) {
        System.out.println(question);
        try {
            return Double.parseDouble(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("Please insert a valid number.");
            return takeInputDouble(bufferedReader, "Try again: ");
        }
    }
}
