package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 150
 * Changing class Vehicle, page 130. Crate class Vehicle2
 * Execute VehConsDemo
 */

public class Vehicle2 {

	int passengers; // Number of passengers
	int fuelcap; // Fuel tank capacity
	int mpg; // Fuel consumption in miles per gallon

	// Page 150. Adding a parameterized constructor in Vehicle2 class
	public Vehicle2(int p, int f, int m) {

		passengers = p;
		fuelcap = f;
		mpg = m;

	}

	// Method return the distance of the trip for the given vehicle
	int range() {
		return mpg * fuelcap;
	}

	// parametrized method, which calculates the amount of fuel needed by a vehicle
	// to overcome a given distance
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
}