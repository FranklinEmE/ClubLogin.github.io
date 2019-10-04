package car_dealership;

public class Queue {
	
	private int maxSize;
	private long[] Queue;
	private int front;
	private int rear;
	private int Intems;
	
	
	
	public Queue(int Size) {
		super();
		this.maxSize = Size;
		Queue = new long[Size];
		this.front = 0;
		this.rear = -1;
		Intems = 0;
	}
	
	public void insert(long j) {
		rear++;
		Queue[rear] = j;
	}
	
	public void view() {
		System.out.println("[");
		for(int j = 0; j < Queue.length; j++) {
			System.out.println(Queue[j] + " ");
			
		}
		System.out.println("]");
	}
	

}
