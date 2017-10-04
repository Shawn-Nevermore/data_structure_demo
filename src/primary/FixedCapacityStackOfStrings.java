package primary;


public class FixedCapacityStackOfStrings {

	private String[] arr;
	private int N = 0;	//��ǰ��ĩԪ����������
	
	public FixedCapacityStackOfStrings(int capacity) {
		arr = new String[capacity];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public void push(String item) {
		arr[N++] = item;
	}
	
	public String pop() {
		String item = arr[--N];
		arr[N] = null; 
		return item;
	}
	
	
}
