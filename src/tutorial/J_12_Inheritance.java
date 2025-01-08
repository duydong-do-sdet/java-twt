package tutorial;

class Pet {
	protected String name;
	protected int age;

	Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	protected void eat() {
		System.out.println(name + " is eating.");
	}
}

class Dog extends Pet {
	String breed;

	Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	void bark() {
		System.out.println(name + " is barking.");
	}
}

public class J_12_Inheritance {

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", 3, "Golden Retriever");

		dog.eat();
		dog.bark();

		System.out.println("Breed: " + dog.breed);
		System.out.println("Age: " + dog.age);
	}

}
