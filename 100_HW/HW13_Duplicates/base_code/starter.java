/*
 *	Author:Armand Vartanian
 *  Date:11/15/26
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int targetnum = (int)((Math.random()*10) + 1);
		int [] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
    		arr[i] = (int)(Math.random() * 10) + 1;
		}
		int dupes = 0;
		for(int i = 0; i < arr.length; i++){
			if (arr[i] == targetnum){
			dupes++;
			System.out.println("Duplicate at arr index: " + i);
			}
		}
		System.out.println("There was " + dupes + " duplicate(s)");
		for(int i = 0; i < arr.length-1; i++){
			if (arr[i] == arr[i + 1]){
			System.out.println("Two consecutive numbers found at index " + i + ", the second at index " + (i + 1) + "." + "The numbers was " + arr[i]);
			}
		}
	}
}
