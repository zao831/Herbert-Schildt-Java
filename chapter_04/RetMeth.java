package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 138
 */

public class RetMeth {

	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		// Assign values to the fields of the object minivan
		minivan.passengers = 7; // Number of passengers
		minivan.fuelcap = 16; // Tank capacity
		minivan.mpg = 21; // Fuel Consumption in Miles per Gallon

		// Assign values to the fields of the object sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		// Get driving range
		range1 = minivan.range();
		range2 = sportscar.range();

		System.out.println(
				"A Minivan can carry " + minivan.passengers + " passengers for a distance of " + range1 + " miles.");

		System.out.println("A Sportscar can carry " + sportscar.passengers + " passengers for a distance of " + range2
				+ " miles.");

		/*
		 * Page 139. To improve the efficiency of the code, you can exclude variables
		 * range1, range2 ;, You must specify the range () method as a parameter; in the
		 * println (...) method;
		 * 
		 * System.out.println("A minivan can carry" + minivan.passengers +
		 * " passengers for a distance of " + minivan.range() + " miles.");
		 */

	}
}