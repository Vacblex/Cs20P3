package mastery;

/*
Thomas Ly
CHHS
December 2nd
Purpose: gets 25 random numbers and sorts them odd or even
*/

public class Exercise1 {
	public static void main(String[] args) {
        int[] numlist = new int[25]; //25 numbers calls for a size of 25
        
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = (int)(Math.random() * 99);
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }
        int[] even = new int[x]; //an array for odd or even
        int[] odd = new int[y];
        
        int e = 0; //placeholder variables
        int o = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % 2 == 0) {
                even[e] = numlist[i];
                e += 1;
            } else {
                odd[o] = numlist[i];
                o += 1;
            }
        }

        System.out.println("Even--------------"); //these next lines till the end will print each number one by one so there is no tomfoolery in the printing
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        
        System.out.println();
        System.out.println();

        System.out.println("Odd---------------");
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println();
    }
}

/*
Even--------------
90 70 84 28 28 76 28 58 52 12 92 40 

Odd---------------
89 43 75 65 19 17 9 97 11 51 51 75 31 
*/
