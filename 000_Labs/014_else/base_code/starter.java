/*
 *	Author:  Armand Vartanian
 *  Date: 9/24/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*999.1) + 1;
		System.out.print("Guess a number between 1 and 1000: ");
		int guess = sc.nextInt();
		if ((guess < 1) || (guess > 1000)) {
			System.out.println("That is not between 1 and 1000!!!!!!!!!!!!!!!!!!!!!");

		} else {
			if (num == guess) {
			System.out.println("Your Guess Was Correct!");
		
		} else {
			System.out.println("Your Guess Was Incorrect");
		}

		}
		
	}
}
