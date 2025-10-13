package A;

public class G_Switch {

    static void main(String[] args) {

        /*switch is an alternative to if/else*/
        /*only works with int, string, byte, enum (enums are collections of constants or list of constants)*/

        String anotherString = "ciao";
        String message;
        switch (anotherString){
            case "abc" -> message = "abc";
            case "ciao" -> message = "it's cioa";
            default -> message = "i dont know";
            }
        System.out.println(message);

        /*arrow syntax interval switches*/
        int x = 10;
        /*switch assignment on the fly*/
        String answer = switch (x) {
            case 1,2,3,4,5 -> "value 1 -5";
            case 6,7,8,9 -> "value 6 -9";
            case 10,11,12 -> "value 10 -12";
            default -> "value > 12";
        };
        System.out.println(answer);
    }
}
