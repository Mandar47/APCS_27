/*
 *	Author:  Armand Vartanian
 *  Date: 9/28/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*999.1) + 1;
		System.out.print("Pick a number between 1 - 1000: ");
		int guess = sc.nextInt();
		if (guess == num) {
			System.out.println("You guesed Correct!");
		} else if (guess < num) {
			System.out.println("Your number was smaller than the number. The number was " + num + ".");
		} else if (guess > num) {
			System.out.println("Your number was greater than the number. The number was " + num + ".");
		}
	}
}
