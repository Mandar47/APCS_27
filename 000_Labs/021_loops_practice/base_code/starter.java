/*
 *	Author:  Armand Vartanian
 *  Date: 9/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("GUESS THE NUMBER ITS 1-1000!!!");
		int randomnum = (int)((Math.random() * 1000) + 1);
		int playerguess = 0;
		while (true) {
			playerguess = sc.nextInt();
			if (playerguess == randomnum) {
				System.out.print("You guessed correctly bye!");
				break;
			} else if (playerguess > randomnum) {
				System.out.println("Your guess is higher than the number!");
			} else if (playerguess < randomnum) {
				System.out.println("Your guess is lower than the number!");
			}
		}
		



		
	}
}
