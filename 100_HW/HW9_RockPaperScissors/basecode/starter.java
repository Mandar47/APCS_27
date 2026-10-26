/*
 *	Author: Armand Vartanian
 *  Date:10/25/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String computerrole1 = "";
        String computerrole2 = "";
        String playerrole = "";
        String isplaying = "";
        boolean playing = true;
        while (playing == true) {
            while (true) {
                System.out.println("Would You like To play? Yes/No/Done");  
                isplaying = sc.nextLine();
                if (isplaying.equalsIgnoreCase("yes") || isplaying.equalsIgnoreCase("NO") || isplaying.equalsIgnoreCase("DONE")) {
                    break;
                } else {
                    System.out.println("try again this was not one of the options!");
                }
            }
            
            if (isplaying.equalsIgnoreCase("Yes")) {
                while (true) {
                    System.out.println("Rock, Paper Or Scissors?");
                    playerrole = sc.nextLine();
                    if (playerrole.equalsIgnoreCase("Rock") || playerrole.equalsIgnoreCase("Paper") || playerrole.equalsIgnoreCase("Scissors")) {
                        break;
                    } else {
                        System.out.println("Was not one of the options pal");
                    }
                }
                computerrole1 = getObject();
                int outcome = compare2(playerrole, computerrole1);
                if (outcome == 0) {
                    System.out.println("You tied!");
                } else if (outcome == 1) {
                    System.out.println("You won!");

                } else {
                    System.out.println("You lost!");
                }

                

            } else if (isplaying.equalsIgnoreCase("No")) {
                System.out.println("How many times do you want the computer to play itself?");
                int timestoplay = sc.nextInt();
                int comp1tally = 0;
                int comp2tally = 0;
                int tietally = 0;
                sc.nextLine();
                int timesplayed = 0;
                while (timesplayed<timestoplay) {
                    computerrole1 = getObject();
                    computerrole2 = getObject();
                    int winner = compare2(computerrole1, computerrole2);
                    if (winner == 0) {
                        tietally++;
                    } else if (winner == 1) {
                        comp1tally++;

                    } else {
                        comp2tally++;
                    }
                    timesplayed++;
                }
                System.out.println("Player 1 won " + comp1tally + " times!");
                System.out.println("Player 2 won " + comp2tally + " times!");
                System.out.println("Player 1 and Player 2 tied " + tietally + " times!");

                


            } else if (isplaying.equalsIgnoreCase("Done")) {
                playing = false;
            } else {
                System.out.println("This shouldn't be happening");
            }
        }
        

    }
    public static int compare2(String p1, String p2) {
        if (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Scissors")) {
            return 1;
        } else if (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("paper")) {
            return 2;
        } else if (p1.equalsIgnoreCase("Rock") && p2.equalsIgnoreCase("Rock")) {
            return 0;
        } else if (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Rock")) {
            return 1;
        } else if (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Scissors")) {
            return 2;
        } else if (p1.equalsIgnoreCase("Paper") && p2.equalsIgnoreCase("Paper")) {
            return 0;
        } else if (p1.equalsIgnoreCase("Scissors") && p2.equalsIgnoreCase("Paper")) {
            return 1;
        } else if (p1.equalsIgnoreCase("Scissors") && p2.equalsIgnoreCase("Rock")) {
            return 2;
        } else if (p1.equalsIgnoreCase("Scissors") && p2.equalsIgnoreCase("Scissors")) {
            return 0;
        } else {
            return 0;
        }
    }
    public static  String getObject(){
        int computerthing = (int)((Math.random() * 3) + 1);
        if (computerthing == 1) {
            return "rock";
        } else if (computerthing  == 2) {
            return "paper";
        } else if (computerthing == 3) {
            return "scissors";
        } else {
            return "";
        }
    }
}

