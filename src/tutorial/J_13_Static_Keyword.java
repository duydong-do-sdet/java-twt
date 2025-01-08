package tutorial;

public class J_13_Static_Keyword {
	static String sv = "Static variable";
	public String pv = "Public variable";

	static void staticMethod() {
		System.out.println("Static method");
	}

	public void publicMethod() {
		System.out.println("Public method");
	}

	public static void main(String[] args) {
		System.out.println(sv);
		staticMethod();

		J_13_Static_Keyword obj = new J_13_Static_Keyword();
		System.out.println(obj.pv);
		obj.publicMethod();
	}

}
