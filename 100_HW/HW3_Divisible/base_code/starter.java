/*
 *	Author: Armand Vartanian
 *  Date: 9/25/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		int num12 = num1%2;
		int num13 = num1%3;
		int num14 = num1%4;
		int num15 = num1%5;
		int num22 = num2%2;
		int num23 = num2%3;
		int num24 = num2%4;
		int num25 = num2%5;
		if ((num13 == 0) && (num14 == 0) && (num15 == 0)) {
			System.out.println(num1 + " is divisible by 3,4, and 5!");
		
		}else{
			if (num12 == 0) {
				System.out.println(num1 + " is divisible by 2!");
			} 
			
			if (num13 == 0) {
				System.out.println(num1 + " is divisible by 3!");
			}
			if (num14 == 0) {
				System.out.println(num1 + " is divisible by 4!");
			}
		
		 if (num15 == 0) {
			System.out.println(num1 + " is divisible by 5!");
		}
		}
		if ((num23 == 0) && (num24 == 0) && (num25 == 0)) {
			System.out.println(num2 + " is divisible by 3,4, and 5!");
		} else {
		 if (num22 == 0) {
			System.out.println(num2 + " is divisible by 2!");
		}
		 
		 if (num23 == 0) {
			System.out.println(num2 + " is divisible by 3!");
		}
		 if (num24 == 0) {
			System.out.println(num2 + " is divisible by 4!");
		}
		if (num25 == 0) {
			System.out.println(num2 + " is divisible by 5!");
		} 
		}
		if ((num23 != 0) && (num24 != 0) && (num25 != 0)) {
			System.out.println(num2 + " is not divisible by 2:(");
			System.out.println(num2 + " is not divisible by 3, 4 or 5");
		}
;	}
}
