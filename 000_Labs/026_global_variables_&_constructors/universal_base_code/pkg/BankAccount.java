/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner = "unknown";
	private double balance = 0;
	private int accountnum = nextAccountNumber;
	private static int nextAccountNumber = (int)((Math.random()*951) + 50);
	private boolean active = true;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "";
		balance = 0;
		active = true;
		accountnum = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String owner2) {
		owner = owner2;
		balance = 0;
		active = true;
		accountnum = nextAccountNumber;
		nextAccountNumber++;

	}
	public BankAccount(String owner3, double balance3) {
		owner = owner3;
		balance = balance3;
		active = true;
		accountnum = nextAccountNumber;
		nextAccountNumber++;
	}


	// -------METHODS-------

}