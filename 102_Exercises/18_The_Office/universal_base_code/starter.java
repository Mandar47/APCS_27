/*
 *	Author: Armand Vartanian
 *  Date: 10/21/26
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jimhalpert = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pambeesly = new Employee(2011, "Pam", "Beesly", 2250);
		Employee nolan = new Employee(4321, "Nolan", "Lee", 5000);
		nolan.raiseSalary(10000);
		dwight.raiseSalary(-100);
		jimhalpert.raiseSalary(10000);
		pambeesly.raiseSalary(-200);
		jimhalpert.employeeToString();
		System.out.println(jimhalpert.getAnnualSalary());
		dwight.employeeToString();
		System.out.println(dwight.getAnnualSalary());
		pambeesly.employeeToString();
		System.out.println(pambeesly.getAnnualSalary());
		nolan.employeeToString();
		System.out.println(nolan.getAnnualSalary());



	}
}
