package A;


import java.util.Scanner;

public class II_ScannerWithCheck {

    static void main(String[] args) {
        /*calculate user age*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert your birth year: ");

        /*check if the input is an int*/
        /*default name for method that return a boolean -> is the method name*/
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            int age = 2025 - birthYear;
            System.out.printf("Your age is :" + age);
            } else {
            System.out.println("could not calculate age,pls put an int :");

        }
    }
}
