package tutorial;

class OuterClass {

	class InnerClass {
		public void display() {
			System.out.println("This is Inner Class");
		}
	}

	public void accessInner() {
		InnerClass in = new InnerClass();
		in.display();
	}

}

public class J_14_Inner_Classes {

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();

		out.accessInner();
		in.display();
	}

}
