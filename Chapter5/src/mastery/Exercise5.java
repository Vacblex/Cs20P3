package mastery;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive number: ");
        int inp = scanner.nextInt();

        int div = 1;
        while (inp / div >= 10) {
            div *= 10;
        }

        for (;div > 0; div /= 10) {
            int digit = inp / div;
            System.out.println(digit);
            inp = inp % div;
        }
    }
}