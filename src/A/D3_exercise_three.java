package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class D3_exercise_three {

    static void main(String[] args) throws IOException  {

        HashMap<String,String> dictionary = new HashMap<>();
        /*method for inserting is put*/

        dictionary.put("gatto", "cat");
        dictionary.put("cane", "dog");
        dictionary.put("casa","house");
        System.out.println(dictionary);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter english word: ");
        String word = bufferedReader.readLine();
        System.out.println("let's search for: " + word +" in dictionary");

        boolean isThere = false;
        for (String key : dictionary.keySet()) {
            if (dictionary.get(key).equals(word)) {
                System.out.println("translation: " + key + " -> " + word);
                isThere = true;
                break;
            }
        }   if (!isThere){
                System.out.println("word not found !");


        }
    }
}
