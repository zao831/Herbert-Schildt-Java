package chapter_13.hw;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 501
 * Questions and exercises 
 * for self-examination
 * Question number 12
 */

public class GenStack2<T> implements IGenStack<T> {

	private T[] stck; // Array for storing the stack elements
	private int tos; // The top of the stack

	// Create empty stack of the specified size
	public GenStack2(T[] stckArray) {
		stck = stckArray;
		tos = 0;
	}

	// Create one stack from another stack
	public GenStack2(T[] stckArray, GenStack2<T> ob) {
		tos = ob.tos;
		stck = stckArray;

		try {
			if (stck.length < ob.stck.length)
				throw new StackFullExeption(stck.length);
		} catch (StackFullExeption exc) {
			System.out.println(exc);
		}

		// Copy item
		for (int i = 0; i < tos; i++) {
			stck[i] = ob.stck[i];
		}
	}

	// Create a stack with initial values
	public GenStack2(T[] stckArray, T[] a) {
		stck = stckArray;

		for (int i = 0; i < a.length; i++) {
			try {
				push(a[i]);
			} catch (StackFullExeption exc) {
				System.out.println(exc);
			}
		}
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