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
		owner = "Unkown";
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
	public String getOwner(){
		return owner;
	}
	public void setOwner(String a){
		owner = a;
	}
	public double getBalance() {
		return balance;
	}
	public void closeAccount(){
		active = false;
	}
	public boolean isActive(){
		return active;
	}
	public void deposit(double a){
		if (active == true) {
			balance += a;
		}
	}
	public void withdraw(double b){
		if (active == true && b <= balance){
			balance -= b;
		} else {
			System.out.print("your account was either not active or had insufficient funds.");
		}
	}

	public void checkBalance() {
		System.out.println("Your current balance is " + getBalance() + " dollars");

	}
	public void displayAccountInfo() {
		System.out.println(owner + " is the owner!");
		if (active == true) {
			System.out.println("The account is active!");
		} else {
			System.out.println("The account is not active!");
		}
		System.out.println(accountnum + " is your account number!");
		System.out.println("Your current balance is " + getBalance() + " dollars");
	}

}