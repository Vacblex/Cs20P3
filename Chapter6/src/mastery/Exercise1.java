package mastery;

/*
Thomas Ly
House maker, 3 different methods.
10:45AM 11/5/2025
*/

public class Exercise1 {
	public static void main(String[] args) {
        addRoof();
        addBase(); //Calls the 3 methods to make the house
        addWalk();
    }
    //Method adds roof
    private static void addRoof() {
        System.out.println("               ( )");
        System.out.println("      ()      (   )      ()");
        System.out.println("     (  )    (     )    (  )");
        System.out.println("    (    )  (       )  (    )");
        System.out.println("   (      )(         )(      )");
        System.out.println("  (       (           )       )");
        System.out.println(" (_______(             )_______)");
        System.out.println(" |      (_______________)      |");
    }
  //Method adds base
    private static void addBase() {
        System.out.println(" |      |     _____     |      |");
        System.out.println(" |      |    |__|__|    |      |");
        System.out.println(" |  ____|    |__|__|    |____  |");
        System.out.println(" | |__|_|   _________   |_|__| |");
        System.out.println(" | |__|_|  |    |    |  |_|__| |");
        System.out.println(" |      |  |    |    |  |      |");
        System.out.println(" |______|  |   .|.   |  |______|");
        System.out.println("        |__|____|____|__|");
    }
  //Method adds walk
    private static void addWalk() {
        System.out.println("               | |");
        System.out.println("               | |___________________________");
        System.out.println("               |_____________________________");
    }
}

/* Screen dump
               ( )
      ()      (   )      ()
     (  )    (     )    (  )
    (    )  (       )  (    )
   (      )(         )(      )
  (       (           )       )
 (_______(             )_______)
 |      (_______________)      |
 |      |     _____     |      |
 |      |    |__|__|    |      |
 |  ____|    |__|__|    |____  |
 | |__|_|   _________   |_|__| |
 | |__|_|  |    |    |  |_|__| |
 |      |  |    |    |  |      |
 |______|  |   .|.   |  |______|
        |__|____|____|__|
               | |
               | |___________________________
               |_____________________________
*/

