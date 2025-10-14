package A;

import java.util.Scanner;

public class III_CalculatingBMIFormula {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert your weight in kg: ");
        int weight = scanner.nextInt();

        System.out.println("insert your height in m: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        String category = "unknown";
        if (bmi < 16.5){
            category = "severe underweight";
        } else if (bmi <= 18.4) {
            category = "underweight";
        } else if (bmi <= 24.9) {
            category = "NORMAL WEIGHT";
        } else if (bmi <= 30) {
            category = "OVERWEIGHT";
        } else if (bmi <= 34.9) {
            category = "FIRST DEGREE OBESITY";
        } else if (bmi <= 40) {
            category = "SECOND DEGREE OBESITY";
        }
        System.out.println("you BMI is : " + bmi + "and you are " + category);

    }
}
