package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_exercise_one {
    /*buble up exception*/
    static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("how many numbers do you want to enter ");
        int firstInt = Integer.parseInt(bufferedReader.readLine());

        int [] numbers = new int[firstInt];

        for (int i = 0; i < firstInt; i++){
            System.out.println("Enter number " + (i+1) + ":");
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println("you entered");
        for (int num : numbers){
            System.out.println(num);
        }


    }

}
