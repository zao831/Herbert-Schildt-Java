package chapter_12.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 463
 * Questions and exercises 
 * for self-examination
 * Question number 4
 */

public class TrafficLightDemo {

	public static void main(String[] args) {

		TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);

		for (int i = 0; i < 9; i++) {
			System.out.println(t1.getColor());
			t1.waitForChange();
		}
		t1.cancel();
	}
}