package A;

import java.util.Arrays;

public class K_ArraysAndLoops {

    static void main(String[] args) {

        /*Arrays are reference type, so Array class*/
        /*declaring the array*/
        /*1 popular method*/

        String [] months = {
                "january", "february", "march"
        };

        /* 2 declarative mode */

        int [] number = new int [3]; /*arrays in java are imutable*/
        number[0] =9;
        number[1] =2;
        number[2] =45;

        /*print raw*/
        System.out.println(number);
        /*print properly*/
        System.out.println(number[2]);

        /*toString from the Array class (classmethod)*/
        System.out.println(Arrays.toString(number));
        number[0] = 19;
        System.out.println(Arrays.toString(number));
        /*get of a property value - lenght it's a property here not a method*/
        System.out.println(number.length);

        /*loops*/
        /*for loop*/
        for (int i = 0; i < months.length; i++){
            System.out.println(months[i]);
        }
        /*for each*/
        for (String month : months){
            System.out.println(month);
        }
    /*while loop*/
    int counter = 0;
    while (counter < number.length){
        System.out.println(number[counter]);
        counter++;
    }
    /* do / while cycle or loop*/
        /*used to build the menu*/
        int counterTwo = 0;
        do {
            System.out.println(number[counterTwo]);
            counterTwo++;
        }while (counterTwo < number.length);

        /*nested arrays*/

        int[][] nested = {
                {1,2,3,4},
                {7,8,9},
        };
        System.out.println(nested[1][1]);

        for (int i=0;i< nested.length;i++){
            for (int j=0;j<nested[i].length; j++){
                System.out.println(nested[i][j]);
            }
        }

        /*foreach*/
        for (int[] internalArray : nested )
            for (int singleNumber : internalArray){
                System.out.println(singleNumber);     }

    }
}
