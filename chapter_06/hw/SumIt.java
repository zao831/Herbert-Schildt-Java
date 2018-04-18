package chapter_06.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 244
 * Questions and exercises 
 * for self-examination
 * Question number 13
 * Executing - SumDemo2
 */

public class SumIt {
	
	int sum(int ... n) {
		
		int result = 0;
		for(int i = 0; i < n.length; i++)
			result += n[i];
		return result;
	}
}