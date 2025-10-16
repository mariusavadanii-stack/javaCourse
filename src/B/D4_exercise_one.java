/*Solve this Exercise: InfiniteAverage
Ask the user how many numbers they want to average.
Manage a method that asks for the user to enter as many numbers as they want. Check type with try/catch and be sure that there are no exceptions thrown.
Print the result in this format:
“The average of 1,2,3,6,9,12 is X”*
Optional: manage a higher-level infinite abstraction loop that asks if you want to start over or exit*/

package B;

import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            calculateAverage(scanner);

            // Ask if the user wants to restart or exit
            System.out.print("Do you want to start over? (yes to continue, any other key to exit): ");
            String response = scanner.next();
            continueCalculating = response.equalsIgnoreCase("yes");
        }

        scanner.close(); // Close the scanner to avoid resource leaks
        System.out.println("Thank you for using the average calculator. Goodbye!");
    }

    private static void calculateAverage(Scanner scanner) {
        int howManyValues = takeInput(scanner, "How many numbers do you want to average?");
        ArrayList<Integer> numbersList = new ArrayList<>();
        double sum = 0;

        for (int i = 0; i < howManyValues; i++) {
            int number = takeInput(scanner, "Insert number " + (i + 1) + ":");
            numbersList.add(number);
            sum += number;
        }

        double average = sum / howManyValues; // Calculate the average
        System.out.printf("The average of %s is %.2f%n", numbersList.toString(), average);
    }

    private static int takeInput(Scanner scanner, String question) {
        System.out.println(question);
        while (true) {
            try {
                return Integer.parseInt(scanner.next()); // Read input and parse it to an integer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please insert a valid integer."); // Handling invalid input
            }
        }
    }
}


}
