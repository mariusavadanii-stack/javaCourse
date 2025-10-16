package B;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class F_RecursiveInfiniteLoops {

    static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //takeInput(bufferedReader, "insert integer");
        sum(bufferedReader);

    }

    private static void sum(BufferedReader bufferedReader){
        int a = takeInput(bufferedReader, "insert first number");
        int b = takeInput(bufferedReader, "insert second number");
        int sum = a + b;
        System.out.printf("result" + sum);


    }


    /*A recursive method is a method that calls itself in order to solve a problem. It breaks the problem down into smaller subproblems of the same type. Each recursive call works toward reaching a base case, which stops the recursion.*/

    private static int takeInput(BufferedReader bufferedReader, String question){
        System.out.println(question);
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e){
            System.out.println("insert an integer");
            return takeInput(bufferedReader, "for the love of God insert and integer");
        }
        /*How It Works: If the user inputs an invalid integer, the method catches the exception and calls itself again to prompt the user for input. This keeps happening until a valid integer is provided.
Base Case: If a valid integer is entered, the recursion stops, and that value is returned.*/
        /*A non-recursive method uses loops (like for, while, etc.) to iterate over data instead of calling itself. This approach typically involves maintaining a state externally and is more straightforward for many problems.*/


    }

}/*end class*/
