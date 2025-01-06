package tutorial;

import java.util.Scanner;

public class J_08_While_Loop {

	public static void main(String[] args) {
		int number = 0;

		while (number <= 10) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}

		Scanner sc = new Scanner(System.in);

		int input;
		int count = 0;

		do {
			System.out.print("Type a number:");
			input = sc.nextInt();
			System.out.println("You tried: " + count + " times.");
			count++;
		} while (input != 10);

		sc.close();
	}

}
