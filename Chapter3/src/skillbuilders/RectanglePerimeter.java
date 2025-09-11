package skillbuilders;
import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = scanner.nextInt();
		System.out.println("What is the length of the rectangle");
		
		int width = scanner.nextInt();
		System.out.println("What is the width of the rectangle");
		
		int answer = length + width;
		System.out.println(answer);
	}

}
