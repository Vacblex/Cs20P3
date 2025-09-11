package skillbuilders;
import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		
		int length = 0;
		int width = 0;
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		System.out.println("What is the length of the rectangle");
		
		int input2 = scanner.nextInt();
		System.out.println("What is the width of the rectangle");
		
		int answer = input + input2;
		System.out.println(answer);
	}

}
