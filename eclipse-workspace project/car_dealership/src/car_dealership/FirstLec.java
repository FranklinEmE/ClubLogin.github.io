package car_dealership;
public class FirstLec {

	//public static void main(String[] args) {
     
  private int maxSize;
  private long[] stackArray;
  private int top;
  
  
   
   public FirstLec(int size) {
   this.maxSize = size;
   this.stackArray = new long[maxSize];
   this.top = -1;
   }
   
	public void push(long j) {
		top++;
		stackArray[top] = j;
		
		
	}
	
	public long pop() {
		int old_top = top;
		top--;
		return stackArray[old_top]
	}
	
pu
	

	}

}