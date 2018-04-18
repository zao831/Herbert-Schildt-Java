package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 */

public class GenStack<T> implements IGenStack<T> {

	private T[] stck; // Array for storing the stack elements
	private int tos; // The top of the stack

	// Create empty stack of the specified size
	public GenStack(T[] aRef) {
		stck = aRef;
		tos = 0;
	}

	// Put the element in stack
	public void push(T obj) throws StackFullExeption {
		if (tos == stck.length)
			throw new StackFullExeption(stck.length);
		stck[tos] = obj;
		tos++;
	}

	// Get element from stack
	public T get() throws StackEmptyExeption {
		if (tos == 0)
			throw new StackEmptyExeption();
		tos--;
		return stck[tos];
	}
}