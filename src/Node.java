
public class Node {

	protected int value;
	protected Node next;

	// constructor
	public Node() {
		value = 0;
		next = null;
	}

	public Node(int v, Node n) {
		value = v;
		next = n;
	}
	
	// Gettere og settere til  Node class.

	public void setNext(Node n) {

		next = n;
	}


	public void setValue(int v) {

		value = v;
	}


	public Node getNext() {

		return next;
	}

	
	
	public int getValue() {

		return value;
	}
}

