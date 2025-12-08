package mastery;

/*
Thomas Ly
CHHS
December 5th
Purpose: tests if text is a palindrome
*/

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int not = 0;
        
        System.out.print("Palindrome tester, enter your text: ");
        String paltest = s.nextLine();
        
        char[] array = new char[paltest.length()]; //makes new arrays in the length of the text
        char[] array2 = new char[paltest.length()];
        
        paltest = paltest.toLowerCase(); //puts them into lowercase
        
        int x = 0;
        
        for (int i = paltest.length() - 1; i >= 0; i--) { //this for loop puts the text into the array character by character backwards
            char l = paltest.charAt(i);
            if (l != ' ') {
                array[x] = paltest.charAt(i);
                x+=1;
            }
        }
        
        x = 0;
        
        for (int i = 0; i < paltest.length(); i++) { //puts text into array forwards this time
            char k = paltest.charAt(i);
            if (k != ' ') {
                array2[x] = paltest.charAt(i);
                x+=1;
            }
        }
        
        
        for (int i = 0; i < paltest.length(); i++) { //checks if they match
            if (array[i] != (array2[i])) {
                not++; //adds 1 if there is a mismatch
            }
            i++;
        }
        
        
        if (not == 0) {
            System.out.println("Is a palindrome"); //if matches (not variable untouched)
        } else {
            System.out.println("Isn't a palindrome"); //if the not variable is changed
        }
    }
}

/* screendump 1
Palindrome tester, enter your text: racecar
Is a palindrome
*/

/* screendump 2
Palindrome tester, enter your text: gibberish
Isn't a palindrome
*/
