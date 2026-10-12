/*
 *	Author:Armand Vartanian
 *  Date:10/8/26
*/

import java.util.*;

public class starter {
    public static void main(String[] args) {
        int number = 10;

        if (number > 5) {
            String message = "Number is greater than 5!";
             System.out.println(message);

        }

       int bonus = 5;
        if (number < 20) {
            
            number = number + bonus;
        }

        System.out.println("Bonus was: " + bonus);
        int x = 0;

        if (x == 0) {
            System.out.println("x is zero!");
        }

        number = 100;
        System.out.println("Final number: " + number);
    }
}
