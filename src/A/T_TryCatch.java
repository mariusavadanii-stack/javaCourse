package A;

public class T_TryCatch {

    static void main(String[] args) {

        String  oneNullString = null;
        /*this is an unchecked exception*/

        try {
            /*certains classed and methodes are prove to errors, like bufferereader, there we must use try - catch*/
            /*check throws in the documentationby hover with the mouse*/

            String smallerString = oneNullString.substring(2);
            /*checked exception are exceptions where IDE is signal it before run, your are going agains the logic, or the rules of programming*/
        } catch (Exception problem) {
            System.out.println("can't substring on a null string");
        }
        System.out.println("ciao!!!");


    }


}
