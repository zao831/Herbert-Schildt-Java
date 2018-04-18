package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 135
 */

public class AddMeth {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		// int range1, range2;

		// Assign values to the fields of the object minivan
		minivan.passengers = 7; // Number of passengers
		minivan.fuelcap = 16; // Tank capacity
		minivan.mpg = 21; // Fuel Consumption in Miles per Gallon

		// Assign values to the fields of the object sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		System.out.println("A minivan can carry " + minivan.passengers + " passengers. ");
		minivan.range(); // Display travel range

		System.out.println("A Sportscar can carry " + sportscar.passengers + " passengers. ");
		sportscar.range();// Display travel range

	}
}