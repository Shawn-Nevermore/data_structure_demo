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
			resize(arr);
		}
		arr[++lastIndex] = item;
	}
	
	public String pop() {
		String item = arr[lastIndex--];
		arr[lastIndex] = null;
		if(arr.length == 4 * (lastIndex+1) && lastIndex > 0) {
//			re
		}
		return item;
	}

	private void resize(String[] arr) {
		String[] copy = new String[2 * arr.length];
		for (int i = 0; i <= lastIndex; i++) {
			copy[i] = arr[i];
		}
		arr = copy;
	}
}
