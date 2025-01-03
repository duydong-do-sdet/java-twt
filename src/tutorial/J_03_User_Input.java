package tutorial;

import java.util.Scanner;

public class J_03_User_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		System.out.println(number);

		boolean value = sc.nextBoolean();
		System.out.println(value);

		String text = sc.next();
		System.out.println(text);

		sc.close();
	}

}
