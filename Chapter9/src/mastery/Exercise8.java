package mastery;

/*
Thomas Ly
CHHS
November 18th
Purpose: tests if text is a palindrome
*/

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int not = 0;
        
        System.out.print("Palindrome tester, enter your text: ");
        String paltest = s.nextLine();
        
        char[] array = new char[paltest.length()];
        char[] array2 = new char[paltest.length()];
        
        paltest = paltest.toLowerCase();
        
        int x = 0;

        for (int i = paltest.length() - 1; i >= 0; i--) {
            char l = paltest.charAt(i);
            if (l != ' ') {
                array[x] = paltest.charAt(i);
                x+=1;
            }
        }
        
        x = 0;
        
        for (int i = 0; i < paltest.length(); i++) {
            char k = paltest.charAt(i);
            if (k != ' ') {
                array2[x] = paltest.charAt(i);
                x+=1;
            }
        }
        
        
        for (int i = 0; i < paltest.length(); i++) {
            if (array[i] != (array2[i])) {
                not++;
            }
            i++;
        }
        
        
        if (not == 0) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Isn't a palindrome");
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
