package mastery;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is your grade in percentage: ");
        double input = scan.nextDouble();
        
        String grade = "";
        
        if (input >= 90) {
            grade = "A";
        } else if (input >= 80) {
            grade = "B";
        } else if (input >= 70) {
            grade = "C";
        } else if (input >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Your grade from percentage to letter is " + grade);
    }
}
