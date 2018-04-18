package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 442
 */

enum Transport3 {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

	private int speed; // Typical vehicle speed

	// Constructor
	Transport3(int s) {
		speed = s;
	}

	// Method
	int getSpeed() {
		return speed;
	}

}

public class EnumDemo3 {

	public static void main(String[] args) {

		// Transport tp;

		// Display speed airplane
		System.out.println("Typical airplane speed: " + Transport3.AIRPLANE.getSpeed() + " miles per hour\n");

		// Display all types of vehicles and their speed
		System.out.println("Typical vehicle speed");
		for (Transport3 t : Transport3.values())
			// if(t == Transport3.TRUCK)
			System.out.println(t + ": " + t.getSpeed() + " miles per hour");
	}
}