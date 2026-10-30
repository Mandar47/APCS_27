package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!	
	public Spiderman() {
		actor = "unkown";
		age = 0;
		villain = "Unkown";
	}	
	public Spiderman(String Achtor) {
		actor = Achtor;
		age = 0;
		villain = "unkown";
	}
	public Spiderman(int ag) {
		actor = "unkown";
		villain = "unkown";
		age = age;
	}
	public Spiderman(String Achtor, int ag) {
		actor = Achtor;
		age = ag;
		villain = "unkown";
	}
	public Spiderman(String achtor, String Villhan, int ag) {
		actor = achtor;
		villain = Villhan;
		age = ag;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public int getAge() {
		return age;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String achtor) {
		actor = achtor;
	}
	public String getVillan(){
		return villain;
	}
	public void setVillan(String villhan){
		villain = villhan;
	}
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
