/*
 *	Author:  Armand Vartanian
 *  Date: 9/30/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Wizard, Warrior, or a Rogue: ");
		String playerchoice = sc.nextLine();
		if (playerchoice.equalsIgnoreCase("Wizard")) {
			System.out.print("You Chose: " + playerchoice + "!");
		} else if (playerchoice.equalsIgnoreCase("Warrior")) {
			System.out.print("You Chose: " + playerchoice + "!");
		} else if (playerchoice.equalsIgnoreCase("Rogue")) {
			System.out.print("You Chose: " + playerchoice + "!");		
		} else {
			System.out.println("THAT WAS NOT ONE OF THE CHOICES!!!");
		}
	}
}
