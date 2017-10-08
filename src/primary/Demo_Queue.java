package primary;

import java.util.Iterator;

public class Demo_Queue<T> implements Iterable<T> {
	private QueueNode first;
	private QueueNode last;
	private int nodeNum;

	private class QueueNode {
		T item;
		QueueNode next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return nodeNum;
	}

	public void enqueue(T item) {
		QueueNode oldLast = last;
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}

		nodeNum++;
	}
	
	public T dequeue() {
		
		QueueNode oldFirst = first;
		first = first.next;
		T item = oldFirst.item;
		oldFirst = null;
		
		if(isEmpty()) {
			last = null;
		}
		
		nodeNum--;
		return item;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<T> {

		QueueNode node = first;
		@Override
		public boolean hasNext() {
			return node.next != null;
		}

		@Override
		public T next() {
			T item = node.item;
			node = node.next;
			return item;
		}
		
	}
	
	public static void main(String[] args) {
		Demo_Queue<Integer> queue = new Demo_Queue<>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(32);
		queue.enqueue(11);
		
		/*Iterator<Integer> it = queue.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}*/
		
		System.out.println(queue.dequeue());
	}
}
