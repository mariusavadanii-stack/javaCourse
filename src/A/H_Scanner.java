package A;

import java.util.Scanner;

public class H_Scanner {
    static void main(String[] args) {
        /*creating a scanner instance*/
        Scanner interaction = new Scanner(System.in);
        /*in flow is from the user to the application*/
        System.out.println("insert number: ");
        int firstInput = interaction.nextInt();
        System.out.printf("insert another int: ");
        int secontInput = interaction.nextInt();

        int sum = firstInput + secontInput;
        System.out.println(sum);

    }
}
