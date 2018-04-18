package chapter_11.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 434
 * Questions and exercises 
 * for self-examination
 * Question number 8
 */

public class ThreadHw {
	
	public static void main(String[] args) {

		TickTockHw tt = new TickTockHw();
		MyThreadHw mt1 = new MyThreadHw("Tick", tt);
		MyThreadHw mt2 = new MyThreadHw("Tock", tt);

		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Interrupted main stream " + exc);
		}
	}
}