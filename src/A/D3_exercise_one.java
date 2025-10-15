package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class D3_exercise_one {

    static void main(String[] args) throws IOException  {

        HashMap<String,String> phonebook = new HashMap<>();
        /*method for inserting is put*/

        phonebook.put("john", "123456");
        phonebook.put("jane", "111111");
        phonebook.put("paul", "222222");
        System.out.println(phonebook);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name: ");
        String name = bufferedReader.readLine();



        /*raw print */
        System.out.println("Phone number for inserted: " + name + " : " + phonebook.get(name));

        System.out.print("Enter a new name to add: ");
        String newName = bufferedReader.readLine();

        System.out.print("Enter the phone number for " + newName + ": ");
        String newNumber = bufferedReader.readLine();

        phonebook.put(newName, newNumber);
        System.out.println("Updated Phonebook: " + phonebook);


    }
}
