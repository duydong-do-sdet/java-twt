package tutorial;

interface Vehicle {
	void changeGear(int a);

	void speedUp(int a);

	void slowDown(int a);

	default void display() {
		System.out.println("Vehicle status");
	}
}

class Car implements Vehicle {
	private int gear = 0;
	private int speed = 0;

	@Override
	public void changeGear(int gear) {
		this.gear = gear;
	}

	@Override
	public void speedUp(int increment) {
		this.speed += increment;
	}

	@Override
	public void slowDown(int decrement) {
		this.speed -= decrement;
		if (this.speed < 0) {
			this.speed = 0;
		}
	}

	public void info() {
		display();

		if (this.speed == 0) {
			System.out.println("The car is stationary and in gear " + this.gear);
		} else {
			System.out.println("Im a car, going " + this.speed + " km/h and Im in gear " + this.gear);
		}
	}

}

public class J_15_Interface {

	public static void main(String[] args) {
		Car car = new Car();

		car.speedUp(20);
		car.slowDown(10);
		car.changeGear(2);
		car.info();
	}

}
