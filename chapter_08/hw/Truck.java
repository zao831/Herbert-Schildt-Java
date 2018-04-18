package chapter_08.hw;
/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 320
 * Questions and exercises 
 * for self-examination
 * Question number 8
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

	// methods for accessing the variable cargocap
	int getCargo() {
		return cargocap;
	}

	void putCargo(int c) {
		cargocap = c;
	}
}