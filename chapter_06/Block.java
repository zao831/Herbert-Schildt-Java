package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 211
 * Create the Block class. It stores the dimensions of a parallelepiped in three dimensions
 * Execute PassOb
 */

public class Block {

	int a, b, c;
	int volume;

	// Parameterized constructor
	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		volume = a * b * c;
	}

	// Return true if ob specifies the same parallelepiped
	boolean sameBlock(Block ob) {
		if ((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else
			return false;
	}

	// Return true if ob specifies parallelepiped of the same volume
	boolean sameVolume(Block ob) {
		if (ob.volume == volume)
			return true;
		else
			return false;
	}
}