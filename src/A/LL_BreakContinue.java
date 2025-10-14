package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LL_BreakContinue {

    static void main(String[] args) throws IOException {

       /*game of interaction ECHO*/
       String input = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write anything and hear the echo, if you input stop, the game is over");


        while (!input.equalsIgnoreCase("stop")){
            input = bufferedReader.readLine();

            if (input.equalsIgnoreCase("pass")){
            continue; /*take you to the open curlies*/
            }
            if (input.equalsIgnoreCase("stop")){
            break; /*take you to the closed curlies*/
            }
            System.out.println("you said: " + input);
            }


        }






    }


