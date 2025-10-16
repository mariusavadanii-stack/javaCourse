package A;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TT_TryCatchWithBr {

    static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*when you see the word 'new' it's a contructor class, an instance of a class*/
        System.out.println("insert a integer");

        try {
            int firstInput = Integer.parseInt(bufferedReader.readLine());
            System.out.println(firstInput);
        } catch (Exception e){
            System.out.println("try again!");
        }

        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");
        System.out.println("hello world!");

    }

}
