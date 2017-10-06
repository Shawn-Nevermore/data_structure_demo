package primary;

public class ResizingArrayStackOfStrings {

	private String[] arr;
	private int lastIndex = -1;

	public ResizingArrayStackOfStrings() {
		arr = new String[1];

	}

	public boolean isEmpty() {
		return lastIndex == -1;
	}

	public void push(String item) {
		if (lastIndex == arr.length - 1) {
			resize(2 * arr.length);
		}
		arr[++lastIndex] = item;
	}

	public String pop() {
		String item = arr[lastIndex--];
		arr[lastIndex] = null;
		if (lastIndex > 0 && lastIndex == arr.length / 4) {
			resize(arr.length / 2);
		}
		return item;
	}

	private void resize(int capacity) {
		String[] copy = new String[capacity];
		for (int i = 0; i <= lastIndex; i++) {
			copy[i] = arr[i];
		}
		arr = copy;
	}
}
