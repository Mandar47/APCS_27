/*
 *	Author: Armand Vartanian
 *  Date:11/8/2026
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number to check for primes!");
		int input = sc.nextInt();
		printPrimes(input);
	}

	public static boolean checkPrime(int num){
		if (num <= 1){
			return false;
		}
		int count = num-1;
		while (count > 1){
			if (num%count == 0){
				return false;
			} 
			count --;
		}
			return true;
		}
		public static void printPrimes(int a){
			int count = a -1;
			while (count > 1){
				if (checkPrime(count)){
					System.out.println(count + " Is Prime!");
				}
				count--;
			}
		}
	}

