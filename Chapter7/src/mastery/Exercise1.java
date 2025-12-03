package mastery;

/*
Thomas Ly
November 17
CHHS
Purpose: Visual money saver
*/

import java.util.Scanner;

public class Exercise1 {
	public static String x = "0";
    public static double total = 0.00;
    
    //runs while option is not 0 which is the quit
    public static void main(String[] args) {
        do {
            choices();
        } while (!x.equals("0"));
    }
    
    private static void choices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Show total"); //moneyTotal();
        System.out.println("2) Add Penny"); //addMoney();
        System.out.println("3) Add Nickel"); //addMoney();
        System.out.println("4) Add Dime"); //addMoney();
        System.out.println("5) Add Quarter"); //addMoney();
        System.out.println("6) Remove all money"); //removeMoney();
        System.out.println("0) Quit");
        System.out.print("Enter a choice: ");
        x = scanner.nextLine();
        if (x.equals("1")) { //total
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
            moneyTotal();
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
        } else if (x.equals("2") || x.equals("3") || x.equals("4") || x.equals("5")) { //the money amounts
            addMoney();
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
            System.out.println("Amount added");
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
        } else if (x.equals("6")) { //removing the money option
            removeMoney();
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
            System.out.println("All removed");
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println();
        } else if (!x.equals("0")) { //if the options isnt 0 which would quit
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("ERROR, choice input is not valid");
            System.out.println();
            System.out.println();
            System.out.println();
            choices();
        } else { //sets it to the quitting option
            x = "0"; //just to make sure it quits 100%
        }
        scanner.close();
    }
    
    private static void addMoney() {
        if (x.equals("2")) { //penny
            total += 0.01;
        } else if (x.equals("3")) { //nickel
            total += 0.05;
        } else if (x.equals("4")) { //dime
            total += 0.10;
        } else { //quarter
            total += 0.25;
        }
    }
    
    private static void moneyTotal() { //$%.2f%n limits decimal places to 2
        System.out.printf("Total is $%.2f%n", total);
    }
    
    private static void removeMoney() {
        total = 0.00; //sets it to $0
    }
}
