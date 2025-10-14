package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_exercise_three {
    /*buble up exception*/
    static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("how many numbers do you want to enter ");
        /*reading from the buffer, transformig the text to int and save it in a variable  firstInt*/
        int firstInt = Integer.parseInt(bufferedReader.readLine());
        /*declare an array with firstInt size*/

        int numbers = 0;
        double sum = 0;
        for (int i = 0; i < firstInt; i++){
            System.out.println("Enter number " + (i+1) + ":");
            sum += Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(sum);

        double avg = sum / firstInt;
        System.out.println(avg);


    }

}
