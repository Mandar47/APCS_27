/*
 *	Author:Armand Vartanian
 *  Date:11/9/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int count = 0;
		 while (count < 1001){
			arr1[count] = count * 3 + 3;
			System.out.println(arr1[count]);
			count ++;
		 }
		 int [] arr2 = new int [1001];
		 int count2 = 0;
		 while (count2 < 1001){
			arr2[count2] = 1000 - count2;
			System.out.println(arr2[count2]);
			count2++;
		 }
		 
	}
}
