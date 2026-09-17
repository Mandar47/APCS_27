/*
 *	Author: Armand Vartanian  
 *  Date: 9/15/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("            WELCOME RESTAURANT OWNER!");
		System.out.println("=================================================");
		System.out.println("What's the name of your restaurant? ");
		String resname = sc.nextLine();
		System.out.println("What's your name? ");
		String playername = sc.nextLine();
		System.out.println("Great to see you, " + playername + "! " + " Let's set up a menu for  " + resname + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String firstitemname = sc.nextLine();
		System.out.println();
		System.out.print("Price of " + firstitemname + " ($): ");
		double firstitemprice = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.print("How many " + firstitemname + " would you like? ");
		double firstitemamount = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.println("Added " + firstitemamount + "x " + firstitemname + " to your order! " + "($" +(firstitemamount*firstitemprice) + ")");
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String seconditemname = sc.nextLine();
		System.out.println();
		System.out.print("Price of " + seconditemname + " ($): ");
		double seconditemprice = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.print("How many " + seconditemname + " would you like? ");
		double seconditemamount = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.println("Added " + seconditemamount + "x " + seconditemname + " to your order! " + "($" +(seconditemamount*seconditemprice) + ")");
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String thirditemname = sc.nextLine();
		System.out.println();
		System.out.print("Price of " + thirditemname + " ($): ");
		double thirditemprice = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.print("How many " + thirditemname + " would you like? ");
		double thirditemamount = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.println("Added " + thirditemamount + "x " + thirditemname + " to your order! " + "($" +(thirditemamount*thirditemprice) + ")");
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double subtotal = ((firstitemamount * firstitemprice) + (seconditemamount*seconditemprice) + (thirditemamount*thirditemprice));
		double taxamount = (subtotal*0.0975);
		double tip = sc.nextDouble();
		double tipamount = (subtotal*(tip/100));
		double total = (subtotal + taxamount + tipamount);
		System.out.println();
		System.out.println("=================================================");
		System.out.println(resname + " - Menu For Today");
		System.out.println("=================================================");
		System.out.println("Owner: " + playername);
		System.out.println("-------------------------------------------------");
		System.out.println("Item                Qty     Price");
	    System.out.println("-------------------------------------------------");
		System.out.println(firstitemname + "          " + firstitemamount + "    " + firstitemprice);
		System.out.println(seconditemname + "          " + seconditemamount + "    " + seconditemprice);
		System.out.println(thirditemname + "          " + thirditemamount + "    " + thirditemprice);
		System.out.println("Subtotal:                   $" + subtotal );
		System.out.println("Tax (9.75%):                 $" + (taxamount));
		System.out.println("Tip:                       " + tip);
		System.out.println("Tip Amount:                $" + tipamount);
		System.out.println("=================================================");
		System.out.println("TOTAL                    $" + total);
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Thanks for eating at " + resname + "!");
		System.out.println("Come back soon -- we'll always have a byte for you!");





	}
}
