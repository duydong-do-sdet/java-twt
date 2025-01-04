package tutorial;

public class J_04_Conditions_Booleans {

	public static void main(String[] args) {
		int a = 13;
		int b = 10;

		// > < == >= <= !=
		// && || !
		boolean compare = !(a > b && a != b) || (a % 2 != 0);

		System.out.println(compare);
	}

}
