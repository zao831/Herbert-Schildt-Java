package chapter_08.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 320
 * Questions and exercises 
 * for self-examination
 * Question number 8
 */

public class TruckDemo {

	public static void main(String[] args) {

		// Create a series of objects such as Truck
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck pickup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;

		gallons = semi.fuelneeded(dist);

		System.out.println("The truck can carry " + semi.getCargo() + " pounds");
		System.out.println("To overcome " + dist + " miles of truck requires " + gallons + " gallons of fuel.\n");

		gallons = pickup.fuelneeded(dist);

		System.out.println("The Pickup truck can carry " + semi.getCargo() + " pounds");
		System.out.println("To overcome " + dist + " miles of truck requires " + gallons + " gallons of fuel.");

	}
}