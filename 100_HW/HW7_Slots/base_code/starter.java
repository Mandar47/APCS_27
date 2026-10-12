/*
 *	Author:Armand Vartanian
 *  Date:10/11/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine wil roll 3 numbers from 1 to 10");
		System.out.println("   a. IF two numbers match, you will double your money.");
		System.out.println("   b. IF three numbers match, you triple your money.");
		System.out.println("   c. IF none match, you lose your money, haha.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		String playing = "";
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int money = 100;
		int moneywagered = 0;
		boolean play = true;
		boolean wronganswer;
		while (play == true) {
			if (money <= 0) {
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				play = false;
				break;
			}
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
			playing = sc.nextLine();
			if ((!playing.equalsIgnoreCase("No")) && (!playing.equalsIgnoreCase("N")) && (!playing.equalsIgnoreCase("YES")) && (!playing.equalsIgnoreCase("Y"))) {
				wronganswer = true;
				while (wronganswer == true) {
					System.out.println("That wasn't quite the correct answer. Try again.");
					System.out.println("--------------------------------------------------");
					System.out.println();
					System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
					playing = sc.nextLine();
					if ((playing.equalsIgnoreCase("Yes")) ||(playing.equalsIgnoreCase("Y")) || (playing.equalsIgnoreCase("NO")) || (playing.equalsIgnoreCase("N"))) {
						wronganswer = false;
					}
				}
			}
				
			
					
			if ((playing.equalsIgnoreCase("Yes")) || (playing.equalsIgnoreCase("Y"))) {
				System.out.print("You have $" + money + ". how much would you like to wager? ");
				moneywagered = sc.nextInt();
				sc.nextLine();
				while ((moneywagered <=0) || (moneywagered > money)) {
					System.out.println("Sneaky! No negatives or 0! OR ENTERING MORE THAN YOU HAVE!!!");
					System.out.println("Please enter a bigger or smaller amount! ");
					moneywagered = sc.nextInt();
					sc.nextLine();
				}
				System.out.println();
				num1 = (int)((Math.random() * 10) + 1);
				num2 = (int)((Math.random() * 10) + 1);
				num3 = (int)((Math.random() * 10) + 1);
				System.out.println("Great Let's Play!!!");
				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				System.out.println("|" + num1 + "|" + num2 + "|" + num3 + "|");
				if ((num1 == num2) && (num2 == num3) && (num1 == num3)) {
					System.out.println("YOU HIT THE JACKPOT! YOUR MONEY HAS BEEN TRIPLED");
					money =  (money - moneywagered) + (moneywagered *3);
					System.out.println("You now have $" + money + "!");
				} else if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
					System.out.println("You won! Your balance has been doubled!");
					money = (money - moneywagered) + (moneywagered *2);
					System.out.println("You now have $" + money + "!");
				} else {
					System.out.println("You lost, nooooooooooo");
					money = money - moneywagered;
					System.out.println("You now have $" + money + " :(");
				}
			} else if ((playing.equalsIgnoreCase("No")) || (playing.equalsIgnoreCase("N"))) {
				System.out.println("Thanks for playing! You had $" + money + "  left!");
				play = false;
			} else {	
			
			}
				
			
		}

	}
}
