package prob2;

public class MyStringStack {
	private Node top;
	
	//Pushes the string s onto the stack -- the top
	//Node is populated with this input String
	//If the input String is null, it is ignored
	public void push(String s) {
		//implement
		if(s==null) return; // if input is null then ignored 
		
		if(top == null) { // For first push 
			Node node = new Node();
			node.value = s;
			node.next = null;
			top = node;
			return;
		}
		
		Node oldTop = top;
		
		Node newNode = new Node();
		newNode.value = s;
		newNode.next = oldTop;
		
		top = newNode;  // top will be replaced with new node 
		
	}
	
	//Pops the stack -- the value stored in the top 
	//Node is returned. If the stack is empty
	//when pop() is called, pop() returns null.
	public String pop() {
		//implement
		if(top == null) return null;
		
		Node node = top;
		top = top.next;
		
		return node.value;
	}
	
	//DO NOT MODIFY
	//Returns a space-separated string consisting
	//of the elements of this stack
	public String toString() {
		return Util.toString(this);
	}

	//DO NOT MODIFY
	private class Node {
		private String value;
		private Node next;
	}
}
