package tutorial;

public class J_06_Arrays {

	public static void main(String[] args) {
		String[] greetings = new String[5];
		greetings[0] = "Hello";
		greetings[1] = "Hi";
		greetings[2] = "Good morning";
		greetings[3] = "Good afternoon";
		greetings[4] = "Good evening";

		System.out.println(greetings[2]);

		int[] numbers = { 13, 10, 97 };

		System.out.println(numbers[1]);
	}

}
