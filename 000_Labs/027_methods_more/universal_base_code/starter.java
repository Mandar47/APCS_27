/*
 *	Author:  Armand Vartanian
 *  Date: 10/22/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();
		x.checkBalance();
		x.displayAccountInfo();
		BankAccount y = new BankAccount("Noah");
		y.checkBalance();
		y.displayAccountInfo();
		BankAccount z = new BankAccount("Armand", 47474747);
		z.checkBalance();
		z.displayAccountInfo();

		
	}
}
