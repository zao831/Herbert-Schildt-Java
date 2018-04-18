package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 260
 * Exercise 7.1
 * Expansion of Vehicle for trucks
 * Super class Vehicle
 * Executing - TruckDemo
 */

public class Truck extends Vehicle {

	private int cargocap; // carrying capacity in pounds

	// Constructor of class Truck
	Truck(int p, int f, int m, int c) {
		// initialize members of the Vehicle class using the constructor of this class
		super(p, f, m);
		cargocap = c;
	}

	// Methods of accessing a variable "cargocap"
	int getCargo() {
		return cargocap;
	}

	void putCargo(int c) {
		cargocap = c;
	}
}
