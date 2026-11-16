/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[(int)((Math.random()*150) + 51)];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)((Math.random()*100) + 1);
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		int average = sum/arr.length;
		System.out.println("The minimum value in this array is " + min);
		System.out.println("The maximum value in this array is " + max);
		System.out.println("The average is " + average);
		System.out.println("There are " + arr.length + " elements in this array");
		
	}
}
