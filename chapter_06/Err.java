package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 215
 * Execute ErrInfo
 */

public class Err {

	String msg; // Message of error
	int severity; // Severity of error

	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}