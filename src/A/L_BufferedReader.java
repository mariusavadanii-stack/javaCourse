package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L_BufferedReader {

    static void main(String[] args) throws IOException {
        /*on the fly instantion*/
        /*bufferedreader it's threads safe*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter int: ");
        int firstInt = Integer.parseInt(bufferedReader.readLine());
        System.out.println("enter a double: ");
        double firstDouble = Double.parseDouble(bufferedReader.readLine());
        System.out.println("enter your name or any string: ");
        String firstString = bufferedReader.readLine();
        System.out.printf(firstInt + " " + firstDouble + " " + firstString);
    }

}
