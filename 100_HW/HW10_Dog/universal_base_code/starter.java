/*
 *	Author:Armand Vartanian
 *  Date:11/01/2026
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Dog one = new Dog("bobby");
		one.setAge(1000);
		Dog two = new Dog("bob", "German Shepherd");
		boolean sleep = one.isSleeping();
		if (sleep == true){
			System.out.println(one.getName() + " is asleep!");
		} else {
			one.bark();
		}
		boolean sleep2 = two.isSleeping();
		if (sleep2 == true && sleep == false){
			two.bark();
		} else {

		}
		if (sleep2 == false && sleep == false){
			two.bark();
		} else {

		}


	}
}
