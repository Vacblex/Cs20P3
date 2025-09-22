package mastery;
import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What pizza diameter do you want");
        int input = scanner.nextInt();
        
        double pizza = (0.05*input*input)+1.75;
        System.out.println(pizza);
	}
}
