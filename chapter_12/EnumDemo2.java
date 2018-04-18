package chapter_12;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 440
 */

enum Transport2 {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo2 {

	public static void main(String[] args) {

		Transport2 tp;

		System.out.println("Constants Transport: ");

		// Use of the values() method
		Transport2[] allTransports = Transport2.values();
		for (Transport2 t : allTransports)
			System.out.println(t);

		System.out.println();

		// Use of the valueOf() method
		tp = Transport2.valueOf("AIRPLANE");
		System.out.println("tp contain " + tp);
	}
}