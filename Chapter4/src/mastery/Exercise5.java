package mastery;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many eggs do you want to buy: ");
        int input = scan.nextInt();
        
        double price = 0;
        int dozen = input / 12;
        int extra = input % 12;
        double totalPrice = 0;
        
        if (dozen < 4) {
            price = 0.5;
            totalPrice = (price * dozen) + ((price/12) * extra);
        } else if (dozen < 6) {
            price = 0.45;
            totalPrice = (price * dozen) + ((price/12) * extra);
        } else if (dozen < 11) {
            price = 0.4;
            totalPrice = (price * dozen) + ((price/12) * extra);
        } else {
            price = 0.35;
            totalPrice = (price * dozen) + ((price/12) * extra);
        }
        
        System.out.println("The total price for your eggs is $" + totalPrice);
	}
}
