package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 131
 * In this class, is announced an object of type Vehicle
 */

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle(); // "minivan" object of type Vehicle
		int range;

		// Assign a value to fields in an object "minivan"
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Calculate the range of travel with a full tank
		range = minivan.fuelcap * minivan.mpg;

		System.out.println("The minivan can carry " + minivan.passengers + " passengers" + " for a distance of " + range
				+ " miles"); // The minivan can carry 7 passengers for a distance of 336 miles

	}
}