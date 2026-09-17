/*
 *	Author:  Armand Vartanian
 *  Date: 9/16/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int zeroand9 = (int)(Math.random() * 10);
		System.out.println("A number between 0 - 9: " + zeroand9);
		int oneandonehundered = (int)((Math.random()* 100) + 1 );
		System.out.println("A number between 1 - 100: " + oneandonehundered);
		double twopointfive = Math.random() + 2.5;
		System.out.println("A number between 2.5 and 3.5: " + twopointfive);
		double fourteen = Math.random()*575 + 14;
		System.out.print("A double between 14 and 589: " + fourteen);
	}
}
