package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 */

public class RectanDemo {

	public static void main(String[] args) {
		
		Rectangle q = new Rectangle();

		q.height = 4.0;
		q.width = 3.0;

		if (q.isSquare()) {
			System.out.println("q is square");
		} else {
			System.out.println("you're a loser");
		}

		System.out.println("q area = " + q.area());

	}
}