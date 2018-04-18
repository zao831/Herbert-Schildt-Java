package chapter_14;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 530
 */

public class ConstructorRefDemo {

	public static void main(String[] args) {

		/*
		 * Create a link to the MyClass constructor. Because the func () method of the
		 * MyFunc interface takes an argument, new_ refers to the parameterized MyClass
		 * constructor, not the default constructor.
		 */
		MyFunc2 myClassCons = MyClass::new;

		// Create an instance of MyClass through reference to the constructor
		MyClass mc = myClassCons.func("Testing");

		// Use just created exemplar MyClass
		System.out.println("String str in mc: " + mc.getStr());
	}
}