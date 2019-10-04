package car_dealership;

public class AppStack {

	public static void main(String[] args) {

		 StackArray dap = new StackArray(7);
		 
		 dap.push(10);
		 dap.push(20);
		 dap.push(30);
		 dap.push(40);
		 dap.push(50);
		 dap.push(60);
		 dap.push(70);
		 
		 
		 while(!dap.isEmpty()) {
			 long value = dap.pop();
			 System.out.println(value);
		 }

	}

}
