package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 438
 */

enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo {

	public static void main(String[] args) {

		Transport tp;

		tp = Transport.AIRPLANE;

		// Display an enumeration value
		System.out.println("Value tp: " + tp);
		System.out.println();

		tp = Transport.TRAIN;

		// Compare two enumerated values
		if (tp == Transport.TRAIN)
			System.out.println("tp contains TRAIN\n");

		// Use an enum for controlling the switch operator
		switch (tp) {
		case CAR:
			System.out.println("The car is carrying people");
			break;
		case TRUCK:
			System.out.println("Truck transports cargo");
			break;
		case AIRPLANE:
			System.out.println("The plane is flying");
			break;
		case TRAIN:
			System.out.println("The train moves on rails");
			break;
		case BOAT:
			System.out.println("Boat swim on the water");
			break;
		}
	}
}