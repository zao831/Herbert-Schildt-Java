package chapter_14;

import java.io.*;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 522
 * Executing LamЬdaExceptionDemo
 */

public interface MyIOAction {
	boolean ioAction(Reader rdr) throws IOException;
}