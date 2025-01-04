package tutorial;

import java.util.Scanner;

public class J_05_If_Else_Nested_Statements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		if (s.equals("Dong")) {
			System.out.println("You typed Dong");
		} else {
			System.out.println("Text value is: " + s);
		}

		int number = Integer.parseInt(s);

		if (number == 0) {
			System.out.println("The number is zero, which is neither even nor odd.");
		} else {
			if (number % 2 == 0) {
				if (number > 0) {
					System.out.println("The number " + number + " is a positive even number.");
				} else {
					System.out.println("The number " + number + " is a negative even number.");
				}
			} else {
				if (number > 0) {
					System.out.println("The number " + number + " is a positive odd number.");
				} else {
					System.out.println("The number " + number + " is a negative odd number.");
				}
			}
		}

		sc.close();
	}

}
