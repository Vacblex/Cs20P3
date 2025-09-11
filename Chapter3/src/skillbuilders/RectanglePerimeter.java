package skillbuilders;
import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the rectangle");
		int length = input.nextInt();
		
		System.out.println("What is the width of the rectangle");
		int width = input.nextInt();
		
		int answer = 2 * length + 2 * width;
		System.out.println("Perimeter = " + answer);
	
		input.close();
	}

}
