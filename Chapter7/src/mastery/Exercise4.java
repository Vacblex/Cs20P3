package mastery;

/*
Thomas Ly
CHHS
November 18th
Purpose: High or Low guesser
*/

import java.util.Scanner;

public class Exercise4 {
	private static int dice1 = (int)(Math.random() * 6) + 1; //the 2 dice
    private static int dice2 = (int)(Math.random() * 6) + 1;
    private static int total = dice1 + dice2; //total of both dice
    private static int score = 1000;
    private static int risk = 0;
    private static int hiorlo = 0;
    
    
    private static void DRPlayer() {
        dice1 = (int)(Math.random() * 6) + 1;
        dice2 = (int)(Math.random() * 6) + 1; //rerolls the dice
        total = dice1 + dice2;
        
        if (hiorlo == 1) { //adds the risked amount if correct, else, subtracts amount
            if (total <= 6) {
                score = score + risk;
            } else {
                score = score - risk;
            }
        } else if (hiorlo == 2) {
            if (total >= 8) {
                score = score + risk;
            } else {
                score = score - risk;
            }
        }
        
        System.out.println(total + " was rolled");
        
        if (score == 0) { //returns to main if no more score
            return;
        }
    }
    
    public static void main(String[] args) {
        try {
            while (score != 0 && hiorlo >= 0) {
                Scanner input = new Scanner(System.in);
                do {
                    System.out.print("How many do you want to risk (" + score + " points): ");
                    risk = input.nextInt();
                    if (risk > score || risk < 0) {
                        System.out.println("");
                        System.out.println("***Cannot risk more then you have and cannot risk negitive number***");
                        System.out.println("");
                    }
                } while (risk > score || risk < 0); //runs until there is a valid risked amount
                
                do {
                    System.out.print("Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: ");
                    hiorlo = input.nextInt();
                    if (hiorlo != 1 && hiorlo != 2 && hiorlo > 0) {
                        System.out.println("");
                        System.out.println("***Please pick one of the 2 numbers***");
                        System.out.println("");
                    }
                } while (hiorlo != 1 && hiorlo != 2 && hiorlo > 0); //runs until there is a valid pick
                
                if (hiorlo < 0) { // quits code is a negative number is inputed
                	System.out.println("Code quit");
                	return;
                }
                
                DRPlayer();
                
                System.out.println("You now have " + score + " points left");
            }
            System.out.println("You lost cuzzo");
        } catch (Exception e) {
            System.out.println("Input not allowed, code ending."); //Catches any errors and ends code if so
        }
    }
}

/*
How many do you want to risk (1000 points): 250
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 2
11 was rolled
You now have 1250 points left
How many do you want to risk (1250 points): 250
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
8 was rolled
You now have 1000 points left
How many do you want to risk (1000 points): 250
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
4 was rolled
You now have 1250 points left
How many do you want to risk (1250 points): 250
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 2
7 was rolled
You now have 1000 points left
How many do you want to risk (1000 points): 500
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
6 was rolled
You now have 1500 points left
How many do you want to risk (1500 points): 750
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 2
10 was rolled
You now have 2250 points left
How many do you want to risk (2250 points): 1000
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
6 was rolled
You now have 3250 points left
How many do you want to risk (3250 points): 2
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
7 was rolled
You now have 3248 points left
How many do you want to risk (3248 points): 248
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
10 was rolled
You now have 3000 points left
How many do you want to risk (3000 points): 3000
Guess low (2-6) type 1, guess high (8-12) type 2 or a negative number to quit: 1
9 was rolled
You now have 0 points left
You lost cuzzo
*/


