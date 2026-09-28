/*
 *	Author:Armand Vartanian
 *  Date:9/22/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Fortune Cookie Generator!");
		int fortunenum = (int)(Math.random()*9.1 + 1);
		if (fortunenum == 1) {
			System.out.println("Your demise is nearing");
		} else if (fortunenum == 2) {
			System.out.println("A great fortune will arive");
		} else if (fortunenum == 3){
			System.out.println("A great Misfortune will come with no way to avoid it");
		} else if (fortunenum == 4) {
			System.out.println("Make sure to take the right path for the event that may come");
		} else if (fortunenum == 5) {
			System.out.println("Dont give up next time you feel you are losing");
		} else if (fortunenum == 6) {
			System.out.println("You will experience a loss in your life");
		} else if (fortunenum == 7) {
			System.out.println("A pleasant surprise is closer than you think.");
		} else if (fortunenum == 8) {
			System.out.println("Your next adventure begins with a single step.");
		} else if (fortunenum == 9) {
			System.out.println("Someone is smiling because of you.");
		} else if (fortunenum == 10) {
			System.out.println("Trust your instincts—they know the way.");
		}
	}
}
