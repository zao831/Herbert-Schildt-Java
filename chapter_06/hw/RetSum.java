package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 13
 * Executing - RetSumDemo
 */

public class RetSum {
	
	int sum(int ... v) {
		
		int sum = 0;
		
		for(int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		return sum;
		
	}
}