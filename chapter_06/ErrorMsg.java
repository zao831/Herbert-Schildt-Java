package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 214
 * Execute ErrMsg
 */

public class ErrorMsg {

	String msgs[] = { "Output error", "Input error", "There is no disk space", "Index out of range" };

	String getErrorMsg(int i) {
		if (i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid error code";

	}
}