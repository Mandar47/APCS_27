/*
 *	Author: Armand Vartanian
 *  Date:9/27/26
 * 	Collaborator:
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int whichword = (int)((Math.random()*3) + 1);
		String guessword = "";
		if (whichword == 1) {
			guessword = "burger";
		} else if (whichword == 2) {
			guessword = "ice";
		} else if (whichword == 3) {
			guessword = "computer";
		}
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println();
		if (guessword.equalsIgnoreCase("burger")) {
			System.out.println("It's a common food to eat at a fast food place");
			System.out.print("What is your Guess? ");
			String burgerans1 = sc.nextLine();
			System.out.println();
			if (!burgerans1.equalsIgnoreCase(guessword)) {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.print("It usually contains meat from a cow: ");
				String burgerans2 = sc.nextLine();
				if (!burgerans2.equalsIgnoreCase(guessword)) {
					System.out.println("The answer was burger, better luck next time!");

				} else {
					System.out.print("You got it! Woo!");
				}
			} else {
				System.out.print("You got it! Woo!");
			}

		}
		if (guessword.equalsIgnoreCase("ice")) {
			System.out.println("It's wet and cold");
			System.out.print("What is your Guess? ");
			String iceans1 = sc.nextLine();
			System.out.println();
			if (!iceans1.equalsIgnoreCase(guessword)) {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.print("It usually comes in a drink: ");
				String iceans2 = sc.nextLine();
				if (!iceans2.equalsIgnoreCase(guessword)) {
					System.out.println("The answer was ice, better luck next time!");

				} else {
					System.out.print("You got it! Woo!");
				}
			} else {
				System.out.print("You got it! Woo!");
			}

		}
		if (guessword.equalsIgnoreCase("computer")) {
			System.out.println("It's something that you can code on");
			System.out.print("What is your Guess? ");
			String computerans1 = sc.nextLine();
			System.out.println();
			if (!computerans1.equalsIgnoreCase(guessword)) {
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.print("You can also play games on it: ");
				String computerans2 = sc.nextLine();
				if (!computerans2.equalsIgnoreCase(guessword)) {
					System.out.println("The answer was computer, better luck next time!");

				} else {
					System.out.print("You got it! Woo!");
				}
			} else {
				System.out.print("You got it! Woo!");
			}

		}
	}
}
