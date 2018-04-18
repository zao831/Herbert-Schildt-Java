package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 142
 */

public class CompFuel {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		double gallons;
		int dist = 252;

		// Assign values to the fields of the object minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Assign values to the fields of the object sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		gallons = minivan.fuelneeded(dist);
		System.out.println("To overcome the " + dist + " miles, the minivan will need " + gallons + " gallons of fuel");

		gallons = sportscar.fuelneeded(dist);
		System.out.println(
				"To overcome the " + dist + " miles, on the sportscar will need " + gallons + " gallons of fuel");

	}
}