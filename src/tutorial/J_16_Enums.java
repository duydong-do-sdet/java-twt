package tutorial;

enum Levels {
	LOW, MEDIUM, HIGH;
}

public class J_16_Enums {

	public static void main(String[] args) {
		Levels level = Levels.HIGH;

		switch (level) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}

}
