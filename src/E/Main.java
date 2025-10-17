package E;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static void main(String[] args) {
        Account account = new Account("jack white", "JW123abc");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu(bufferedReader, account);
        /*we pasted the bufferReader and account for menu method to be able to use them*/
    } /*end main*/

    private static int takeInput(BufferedReader bufferedReader, String question) {
        System.out.println(question);
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println("insert an integer");
            return takeInput(bufferedReader, "for the love of God insert and integer");
        }
    }
    /*BufferReader and Account were defined in the main method*/
    /*we need to passed into the method from the outside as arguments*/
    public static void menu(BufferedReader bufferedReader, Account account){
            while(true) {
                System.out.println();
                int menuChoice = takeInput(bufferedReader, "user Menu: \n1) press 1 for Account Info\n2) Pres 2 for deposit\n3) pres 3 for withdraw\n4 press 4 to exit");
                switch (menuChoice){
                    case 1 -> account.showState(); /*call the method*/
                    case 2 -> account.deposit(takeInput(bufferedReader,"Input the amount you wih to deposit:  "));
                    case 3 -> account.withdraw(takeInput(bufferedReader,"Input the amount you wish to withdraw"));
                    case 4 -> System.exit(0);
                    default -> System.out.println("Please choose a value between 1 and 4 :)");
                }
            }
        }
}
