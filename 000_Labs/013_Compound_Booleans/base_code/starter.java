/*
 *	Author:  Armand Vartanian
 *  Date: 9/22/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Please enter your second number: ");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.print("Please enter your third number: ");
		int num3 = sc.nextInt();
		System.out.println();
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Your First Number Was the Largest");
			System.out.println("The number was " + num1 + ".");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("Your Second Number Was the Largest");
			System.out.println("The number was " + num2 + ".");
		} else if ((num3 > num2) && (num3 > num1)) {
			System.out.println("Your Third Number Was the Largest");
			System.out.println("The number was " + num3 + ".");
		}
		if ((num1 < num2) && (num1 < num3)) {
			System.out.println("Your First Number Was the Smallest");
			System.out.println("The number was " + num1 + ".");
		} else if ((num2 < num1) && (num2 < num3)) {
			System.out.println("Your Second Number Was the Smallest");
			System.out.println("The number was " + num2 + ".");
		} else if ((num3 < num2) && (num3 < num1)) {
			System.out.println("Your Third Number Was the Smallest");
			System.out.println("The number was " + num3 + ".");
		}
	}
}
