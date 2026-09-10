/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your First Name?");
		String firstname = sc.nextLine();
		System.out.println("Your Name is " + firstname);
		System.out.println("Whats your age?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Your age is " + age);
		System.out.println("What is your birthday month?");
		String birthdaymonth = sc.nextLine();
		System.out.println("Your birthday month is " + birthdaymonth);
		System.out.println("What is your birthday day?");
		int birthdayday = sc.nextInt();
		System.out.println("Your birthday day is " + birthdayday);
		System.out.println("What is your birthday year");
		int birthdayyear = sc.nextInt();
		System.out.println("Your birthday year is " + birthdayyear);
		System.out.print("What is a Buck Fifty?");
		double buck50 = sc.nextDouble();
		System.out.print("A buck fifty is " + buck50);

	}
}
