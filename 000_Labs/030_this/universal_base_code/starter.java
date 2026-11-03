/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf test = new PooleDwarf("poole", 5);
		PooleDwarf one = new PooleDwarf("nolan", 3);
		PooleDwarf two = new PooleDwarf("poole", 2);
		PooleDwarf three = new PooleDwarf("poole", 3);
		PooleDwarf four = new PooleDwarf("bob", 3);
		PooleDwarf five = new PooleDwarf("jack", 3);
		PooleDwarf six = new PooleDwarf("poole", 4);
		int samename = 0;
		int timesran = 0;
		if (test.isSameName(one.getName())){
			samename += 1;
		}
		if (test.isSameName(two.getName())){
			samename += 1;
		}
		if (test.isSameName(three.getName())){
			samename += 1;
		}
		if (test.isSameName(four.getName())){
			samename += 1;
		}
		if (test.isSameName(five.getName())){
			samename += 1;
		}
		if (test.isSameName(six.getName())){
			samename += 1;
		}
		System.out.println("The name that was compared was " + test.getName() + " and it had " + samename + " duplicates.");
	}
}

