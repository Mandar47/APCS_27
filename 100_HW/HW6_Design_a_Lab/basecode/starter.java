/*
 *	Author:Armand Vartanian
 *  Date:10/04/26
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        /* Rng Game Thingy */
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = sc.nextLine();
        System.out.println("Would you Like to be a Wizard, Dragon, or Knight");
        System.out.println("Wizard gives you access to buffs 1-10");
        System.out.println("Dragon gives you access to buffs 11-20");
        System.out.println("Knight gives you access to buffs 21-30");
        String playerClass = sc.nextLine();
        int roll = 0;
        if (playerClass.equalsIgnoreCase("Wizard")) {
            roll = (int)((Math.random()*10) + 1);
      
        } else if (playerClass.equalsIgnoreCase("Dragon")) {
            roll = (int)((Math.random()*10) + 11);
        } else if (playerClass.equalsIgnoreCase("Knight")) {
            roll = (int)((Math.random()*10) + 21);           
        } else {
            System.out.println("that wasnt one of the options...");
            playerClass = sc.nextLine();
            if (playerClass.equalsIgnoreCase("Wizard")) {
                roll = (int)((Math.random()*10) + 1);
            } else if (playerClass.equalsIgnoreCase("Dragon")) {
                roll = (int)((Math.random()*10) + 11);
            } else if (playerClass.equalsIgnoreCase("Knight")) {
                roll = (int)((Math.random()*10) + 21); 
            } else {
                System.out.println("you did it again, I give up");
            }
        }
        String buff = "";
        if (roll == 1) {
            buff = "Strength I";
        } else if (roll == 2) {
            buff = "Agility V";
        } else if (roll == 3) {
            buff = "Inteligence II";
        } else if (roll == 4) {
            buff = "NO BUFF😂";
        } else if (roll == 5) {
            buff = "NO BUFF😂";
        } else if (roll == 6) {
            buff = "Charisma I";
        } else if (roll == 7) {
            buff = "Sword I";
        } else if (roll == 8) {
            buff = "Strength III";
        } else if (roll == 9) {
            buff = "Sword IV";
        } else if (roll == 10) {
            buff = "Agility II";
        } else if (roll == 11) {
            buff = "Strength IV";
        } else if (roll == 12) {
            buff = "NO BUFF😂";
        } else if (roll == 13) {
            buff = "Sword II";
        } else if (roll == 14) {
            buff = "Inteligence I";
        } else if (roll == 15) {
            buff = "Agility III";
        } else if (roll == 16) {
            buff = "Sword V";
        } else if (roll == 17) {
            buff = "NO BUFF😂";
        } else if (roll == 18) {
            buff = "Charisma II";
        } else if (roll == 19) {
            buff = "Strength V";
        } else if (roll == 20) {
            buff = "Sword III";
        } else if (roll == 21) {
            buff = "Inteligence III";
        } else if (roll == 22) {
            buff = "Charisma III";
        } else if (roll == 23) {
            buff = "Strength II";
        } else if (roll == 24) {
            buff = "Charisma V";
        } else if (roll == 25) {
            buff = "Agility I";
        } else if (roll == 26) {
            buff = "Inteligence IV";
        } else if (roll == 27) {
            buff = "Sword IV";
        } else if (roll == 28) {
            buff = "Agility IV";
        } else if (roll == 29) {
            buff = "Inteligence V";
        } else if (roll == 30) {
            buff = "NO BUFF😂";
        } else {
            System.out.println("THIS SHOULDENT BE HAPPENING!!!");
        }
        System.out.print("You are " + playerName + ", a " + playerClass + " with the buff of " + buff + "!");
    }
}
