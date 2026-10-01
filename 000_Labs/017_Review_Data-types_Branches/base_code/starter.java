/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your NAME");
		String charname = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String chartitle = sc.nextLine();
		System.out.print("Would you like to be a Wizard, Warrior, or a Rogue: ");
		String playerchoice = sc.nextLine();
		if (playerchoice.equalsIgnoreCase("Wizard")) {
			System.out.print("You've chosen Wizard! Excelsior!");
		} else if (playerchoice.equalsIgnoreCase("Warrior")) {
			System.out.print("You've chosen the Warrior! For honor!");
		} else if (playerchoice.equalsIgnoreCase("Rogue")) {
			System.out.print("You've Chosen the Rogue! How cunning!");		
		} else {
			System.out.println("THAT WAS NOT ONE OF THE CHOICES!!!");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		int skillPoints = 20;
		System.out.println("Strength(1-10)");
		int strength = sc.nextInt();
		if ((strength > 10) || (strength < 1) || (strength > skillPoints)) {
			System.out.println("Please input a bigger/smaller value, must be less than 10 or greater than 0. Strength(1-10): ");
			strength = sc.nextInt();
		} else {
			skillPoints = skillPoints - strength;
		}
		System.out.println("You have " + skillPoints + " to spend.");
		System.out.println("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if ((dexterity > 10) || (dexterity < 1) || (dexterity > skillPoints)) {
			System.out.println("Please input a bigger/smaller value, must be less than 10 or greater than 0. Dexterity (1-10): ");
			dexterity = sc.nextInt();
		} else {
			skillPoints = skillPoints - dexterity;
		}
		System.out.println("You have " + skillPoints + " to spend.");
		System.out.println("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if ((intelligence > 10) || (intelligence < 1) || (intelligence > skillPoints)) {
			System.out.println("Please input a bigger/smaller value, must be less than 10 or greater than 0. Intelligence (1-10): ");
			intelligence = sc.nextInt();
		} else {
			skillPoints = skillPoints - intelligence;
		}
		System.out.println("You have " + skillPoints + " to spend.");
		System.out.println("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if ((charisma > 10) || (charisma < 1) || (charisma > skillPoints)) {
			System.out.println("Please input a bigger/smaller value, must be less than 10 or greater than 0. Charisma (1-10): ");
			charisma = sc.nextInt();
		} else {
			skillPoints = skillPoints - charisma;
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + charname + ", " + chartitle + "of CVHS.");
		System.out.println("You're a " + playerchoice + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println();
		System.out.println("Good luck on your quest " + charname + "!");



    }
}
