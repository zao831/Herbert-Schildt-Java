package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 215
 * Execute ErrInfo
 */

public class ErrorInfo {

	String[] msgs = { "Output error", "Input error", "There is no disk space", "Index out of range" };

	int[] howbad = { 3, 3, 2, 4 };

	Err getErrorInfo(int i) {
		if (i >= 0 & i < msgs.length)
			return new Err(msgs[i], howbad[i]);
		else
			return new Err("Invalid error code", 0);

	}
}