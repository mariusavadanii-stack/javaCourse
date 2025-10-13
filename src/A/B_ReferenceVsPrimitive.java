package A;

import java.awt.*;

public class B_ReferenceVsPrimitive {

    static void main(String[] args) {

        /*mirror values*/

        int x = 1;
        int y = x;
        System.out.println(y);

        /*create an instance of a class*/
        Point firstPoint = new Point(1,1);
        Point secondPoint = firstPoint;
        System.out.println(secondPoint);
        /*set a value*/
        firstPoint.x=45;
        System.out.println(secondPoint);


    }
}
