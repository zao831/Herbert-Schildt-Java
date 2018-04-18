package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 260
 * Exercise 7.1
 * Subclass Truck
 */

public class Vehicle {

	private int passengers; // Number of passengers
	private int fuelcap; // Tank volume in gallons
	private int mpg; // Fuel Consumption in Miles per Gallon

	// Vehicle class constructor
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Return the distance of the trip
	int range() {
		return mpg * fuelcap;
	}

	// Calculates the volume of fuel needed by a vehicle to overcome a given
	// distance
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	// Methods for accessing instance variables
	int getPassengers() {
		return passengers;
	}

	void setPassengers(int p) {
		passengers = p;
	}

	int getFuelcap() {
		return fuelcap;
	}

	void setFuelcap(int f) {
		fuelcap = f;
	}

	int getMpg() {
		return mpg;
	}

	void setMpg(int m) {
		mpg = m;
	}
}