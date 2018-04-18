package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 444
 */

enum Transport4 {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo4 {

	public static void main(String[] args) {

		Transport4 tp, tp2, tp3;

		// Get ordinal values using the ordinal() method
		System.out.println("Transport enumeration constants and their ordinal values: ");
		for (Transport4 t : Transport4.values())
			System.out.println(t + " " + t.ordinal()); // get the ordinal value

		tp = Transport4.AIRPLANE;
		tp2 = Transport4.TRAIN;
		tp3 = Transport4.AIRPLANE;

		System.out.println();

		// Demonstrating the use of the compareTo() method
		if (tp.compareTo(tp2) < 0)
			System.out.println(tp + " goes before " + tp2);

		if (tp.compareTo(tp2) > 0)
			System.out.println(tp2 + " goes before " + tp);

		if (tp.compareTo(tp3) == 0)
			System.out.println(tp + " coincides with " + tp3);
	}
}