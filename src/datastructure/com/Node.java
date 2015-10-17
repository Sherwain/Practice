package datastructure.com;

import java.util.Iterator;

public class Node<E extends Comparable<E>>{
	private Node<E> next;
	private E value;
	
	
	public Node(){
		next = null;
		value = null;
	}
	
	public Node(Node<E> next, E value){
		this.next = next;
		this.value = value;
	}
	
	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	
	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	
	
	public int compareTo(Node<E> node){
		
		return this.getValue().compareTo(node.getValue());
	}

	
}
