package car_dealership;

public class NodeApp {

	public static void main(String[] args) {
		
		Node NodeA = new Node();
		NodeA.data = 1;
		
		Node NodeB = new Node();
		NodeB.data = 2;
		
		Node NodeC = new Node();
		NodeC.data = 3;
		
		Node NodeD = new Node();
		NodeD.data = 4;
		
		NodeA.next = NodeB;
		NodeB.next = NodeC;
	    NodeC.next = NodeD;
	    
	    System.out.println(listLength(NodeA)); 
	    System.out.println(listLength(NodeB)); 
	    System.out.println(listLength(NodeC)); 
	    System.out.println(listLength(NodeD)); 

		
  	}
	
  public static int listLength(Node aNode) {
	 int length = 0;
	Node currentNode = aNode;
	
	while(currentNode != null) {
		length++;
		currentNode = currentNode.next;
		
	}
	return length;
  }

}
