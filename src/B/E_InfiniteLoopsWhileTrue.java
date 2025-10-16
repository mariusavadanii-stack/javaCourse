package B;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E_InfiniteLoopsWhileTrue {

    static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        takeInput(bufferedReader);

    }

    private static void takeInput(BufferedReader bufferedReader) {
        System.out.println("insert an integer between 1 and 100:");
        /*conditioned infinite while loop*/
        while (true){
            try{
                int number = Integer.parseInt(bufferedReader.readLine());
              /*range check*/
                if (number >= 1 && number <= 100){
                    System.out.println("you did good bro! the number is : " + number);
                    break; /*this isi the only way out of here*/
                } else {
                    System.out.println("range error!");
                }
            } catch (Exception e) {
                System.out.println("type error");
            }
        }



    } /*main*/

} /*class end*/
