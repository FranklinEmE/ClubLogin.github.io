package stackArray;

public class StackArray {
	
	private int maxSize;
	private long[] StackArray;
	private int top;
	
	
	
	public StackArray(int Size) {
		super();
		this.maxSize = Size;
		StackArray = new long[maxSize];
		this.top = -1;
	}
	
	public void push(long j) {
		if(isFull()) {
			System.out.println("the stack is already full");
		}else {
		top++;
		StackArray[top] = j;
	}
	}
	public long pop() {
		if(isEmpty()) {
			System.out.println("the stack is already empty");
			return -1;
		}else {
			int old_top = top;
		top--;
		return StackArray[old_top];
	}
	}
	public long peak() {
		return StackArray[top];
		
	}
	public boolean isFull() {
		return (maxSize-1 == -1);
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	
	
	

}


