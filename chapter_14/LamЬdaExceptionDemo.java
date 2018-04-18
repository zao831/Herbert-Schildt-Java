package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 522
 * This block lambda-expression can throw an IOException. Therefore, this exception must be specified in the throws statement of the ioAction () method of the MyIOAction functional interface.
 */

public class LamЬdaExceptionDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		double[] values = { 1.0, 2.0, 3.0, 4.0 };

		// This block lambda expression can throw an IOException. Therefore, this
		// exception must be specified in the throws statement of the ioAction () method
		// of the MyIOAction
		MyIOAction myIO = (rdr) -> {
			int ch = rdr.read();
			// ...
			return true;
		};
	}
}