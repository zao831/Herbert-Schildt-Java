package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 130/135
 * A program that uses the Vehicle class
 */

public class Vehicle {

	int passengers; // Number of passengers
	int fuelcap; // Fuel tank capacity
	int mpg; // Fuel Consumption in Miles per Gallon

	// Page 135. Changing class Vehicle. Adding a method range() type void.

	// Display travel range
	// void range() {
	// System.out.println("Range - " + fuelcap * mpg + " miles.");
	// }

	// Page 138. Change the type void to int of the range() method. Method return
	// the distance of the trip for the given vehicle
	int range() {
		return mpg * fuelcap;
	}

	// Page 142. Adding a parametrized method in which calculates the amount of fuel
	// needed by a vehicle to overcome a given distance
	double fuelneeded(int miles) {

		return (double) miles / mpg;

	}
}