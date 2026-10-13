/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String a = sc.nextLine();
		System.out.println("Please enter another sentence");
		String b = sc.nextLine();
		toString(a);
		toStringCombined(a, b);
	}
	public static void toString(String a) {
		System.out.println(a);
		return;
		
	}
	public static void toStringCombined(String a, String b) {
			System.out.println(a + " " + b);
			return;
		}

}
