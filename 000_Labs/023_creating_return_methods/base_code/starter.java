/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int num1, int num2) {
		int x = 1;
		int multiplier = num1;
		while (x < num2) {
			num1 = num1 * multiplier;
			x = x + 1;
		}
		return num1;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter a number");
	int num1 = sc.nextInt();
	sc.nextLine();
	System.out.println("Please enter another number");
	int num2 = sc.nextInt();
	System.out.println(pow(num1, num2));



		
	}
}
