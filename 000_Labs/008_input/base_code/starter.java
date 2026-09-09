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
		String firstname = sc.nextLine();
		System.out.println("Whats your First Name?");
		System.out.println("Your Name is " + firstname);
		int age = sc.nextInt();
		System.out.println("Whats your age?");
		System.out.println("Your age is" + age);
		String birthdaymonth = sc.nextLine();
		System.out.println("What is your birthday month");
		System.out.println("Your birthday month is " + birthdaymonth);
		String birthdayday = sc.nextLine();
		System.out.println("What is your birthday day?");
		System.out.println("Your birthday day is " + birthdayday);
		String birthdayyear = sc.nextLine();
		System.out.println("What is your birthday year");
		System.out.println("Your birthday year is " + birthdayyear);
		double buck50 = sc.nextDouble();
		System.out.print("What is a Buck Fifty?");
		System.out.print("A buck fifty is " + buck50);

	}
}
