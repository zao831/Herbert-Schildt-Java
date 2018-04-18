package chapter_04;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 151
 */

public class VehConsDemo {

	public static void main(String[] args) {

		// Fully construct objects
		Vehicle2 minivan = new Vehicle2(7, 16, 21);
		Vehicle2 sportscar = new Vehicle2(2, 14, 12);
		double gallons;
		int dist = 252;

		
		gallons = minivan.fuelneeded(dist);
		System.out.println("To overcome the " + dist + " miles, the minivan will need " + gallons + " gallons of fuel");

		
		gallons = sportscar.fuelneeded(dist);
		System.out.println(
				"To overcome the " + dist + " miles, on the sportscar will " + "need " + gallons + " gallons of fuel");

	}
}