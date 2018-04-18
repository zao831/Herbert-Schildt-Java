package chapter_13;

/*
 * Herbert Schildt
 * Java: A Beginners Guide
 * Page 490
 * Exercise 13.1
 */

public class GenQueue<T> /* implements IGenQ<T> */ {

	private T[] q; // array for the storage chars

	private int putloc, getloc; // indexes for inserting and extracting items from the queue

	// Create empty queue from specific array
	public GenQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}

	// Put item in the queue
	public void put(T obj) throws QueueFullException {
		if (putloc == q.length - 1)
			throw new QueueFullException(q.length);

		q[putloc++] = obj;

	}

	// Get item from the queue
	public T get() throws QueueEmptyException {
		if (getloc == putloc)
			throw new QueueEmptyException();

		return q[getloc++];
	}
}