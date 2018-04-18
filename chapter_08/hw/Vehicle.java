package chapter_08.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 320
 * Questions and exercises 
 * for self-examination
 * Question number 8
 * Subclass Track
 */

public class Vehicle implements IVehicle {
	
	private int passengers; // Number of passengers
	private int fuelcap; // Fuel tank capacity
	private int mpg; // Fuel consumption in miles per gallon

	// The constructor of the class Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Return the distance of the trip
	public int range() {
		return mpg * fuelcap;
	}

	// calculates the amount of fuel needed by a vehicle to overcome a given distance
	public double fuelneeded(int miles) {
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