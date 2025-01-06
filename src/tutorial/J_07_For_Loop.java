package tutorial;

import java.util.Scanner;

public class J_07_For_Loop {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		String[] values = new String[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < values.length; i++) {
			System.out.print("Input:");
			values[i] = sc.nextLine();
		}

		sc.close();

		for (String v : values) {
			if (v.equals("Java")) {
				// break;
				continue;
			}
			System.out.println(v);
		}
	}

}
