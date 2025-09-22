package mastery;
import java.util.Scanner;
public class Exercise7 {
	public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input your 3 digit number: ");
        int input = scanner.nextInt();
        
        int hundred = input / 100;
        System.out.println("Hundreds: " + hundred);
        
        int ten = (input / 10) % 10;
        System.out.println("Tens: " + ten);
        
        int one = input % 10;
        System.out.println("Ones: " + one);
	}
}
