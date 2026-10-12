/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times should I print out your name?");
		int amount = sc.nextInt();
		int x = 0;
		while (x < amount) {
			System.out.println(name);
			x = x + 1;
		}


		
	}
}
