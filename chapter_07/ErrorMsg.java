package chapter_07;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 286
 * Executing FinalD
 */

public class ErrorMsg {

	// Error codes. Constants are declared using the final keyword
	final int OUTERR = 0;
	final int INERR = 1;
	final int DISKERR = 2;
	final int INDEXERR = 3;

	String msgs[] = { "Output error", "Input error", "There is no disk space", "Index out of range" };

	// return error message
	String getErrorMsg(int i) {
		if (i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid error code";
	}
}