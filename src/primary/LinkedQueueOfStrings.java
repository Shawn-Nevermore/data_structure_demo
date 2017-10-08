package primary;

public class LinkedQueueOfStrings {

	private Node last, first;
	
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	
	public void enqueue(String item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		
	}
	
	public String dequeue() {
		Node oldFirst = first;
		first = first.next;
		String item = oldFirst.item;
		oldFirst = null;
		
		if(isEmpty()) {
			last = null;
		}
		return item;
	}
	
	public static void main(String[] args) {
		LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("2");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
				
		
		queue.enqueue("12");
		queue.enqueue("22");
		queue.enqueue("32");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
