package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D2_exercise_two {
    /*buble up exception*/
    static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("how many numbers do you want to enter ");
        /*reading from the buffer, transformig the text to int and save it in a variable  firstInt*/
        int firstInt = Integer.parseInt(bufferedReader.readLine());
        /*declare an array with firstInt size*/
        int [] numbers = new int[firstInt];

        for (int i = 0; i < firstInt; i++){
            System.out.println("Enter number " + (i+1) + ":");
            numbers[i] = Integer.parseInt(bufferedReader.readLine());
        }
        /*initilize the variable max with the first element of the array*/
        int max = numbers[0];
        /*initilize the variable min with the first element of the array*/
        int min = numbers[0];

        /*for-each loop 'int num' - declares a variable num of type int, on each iteration, num will hold the value f the current element from the array, ':' mean in, number is the array you're looping through*/

        for (int num : numbers){
            /*check if num is greater than max, if yes it updates max*/
            if (num > max){
                max = num;
            }
            if (num < min){
                /*check if num is less than min, if yes it updates min*/
                min =num;
            }
        }
        System.out.println("===printing max & min ======");
        System.out.println(max);
        System.out.println(min);

    }

}
