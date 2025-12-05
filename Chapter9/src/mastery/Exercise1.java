package mastery;

public class Exercise1 {
	public static void main(String[] args) {
        int[] numlist = new int[25];
        
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
        int[] even = new int[x];
        int[] odd = new int[y];
        
        int e = 0;
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

        System.out.println("Even--------------");
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
