package chapter_06;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 211
 * Usage the Block class, passing parameters to the constructor, work with the methods of the an class computing
 */

public class PassOb {

	public static void main(String[] args) {
		
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);

		System.out.println("ob1 has the same dimensions as ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob1 has the same dimensions as ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob1 has the same volume as ob3: " + ob1.sameVolume(ob3));
		
	}
}