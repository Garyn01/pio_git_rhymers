package edu.kis.vh.nursery.list;

/**
 * Node used for a Linked List of ints
 * contains one int and pointers to two other Nodes
 * possible methods:
 * get/setValue - getter/setter for Value
 * get/setPrev - getter/setter for previous Node
 * get/setNext - getter/setter for next Node
 *
 */
public class Node {

	private int value;
	private Node prev;
	private Node next;


	public Node(final int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
