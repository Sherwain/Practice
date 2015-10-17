package datastructure.com;

import java.util.EmptyStackException;
import java.util.Iterator;

import com.datastructure.Node;;

public class Linkedlist<E extends Comparable<E>> implements Iterable<E>{
	
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public Linkedlist(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public Linkedlist(Node<E> head, Node<E> tail, int size){
		setHead(head);
		setTail(tail);
		setSize(0);
	}
	
	public void push(E value){
		Node<E> node = new Node<E>(this.head, value);
		if (head == null)
			tail = node;
		head = node;
		size++;
	}
	
	public Node<E> getHead() {
		return head;
	}
	
	private void setHead(Node<E> head) {
		this.head = head;
	}
	
	public Node<E> getTail() {
		return tail;
	}
	
	private void setTail(Node<E> tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		return size;
	}
	
	private void setSize(int size) {
		this.size = size;
	}

	@Override
	public Iterator<E> iterator() {
		return new ListIterator();
	}
	
	public String toString(){
		if (head == null)
			return "[]";
		
		StringBuilder str = new StringBuilder("[");
		
		Iterator<E> it = this.iterator();
		
		if (!it.hasNext())
			return "[]";
		
		while (it.hasNext()){
			str.append(it.next() + ", ");
		}
		
		return str.replace(str.length() - 2, str.length(), "]") .toString();
	}
	
	public class ListIterator implements Iterator<E>{
        private Node<E> current;

        public ListIterator(){
            current = getHead();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) return null;
            E item = current.getValue();
            current = current.getNext();
            return item;
        }

        @Override
        public void remove() {
            if (!hasNext()) throw new EmptyStackException();
            current = current.getNext();
            setSize(getSize() - 1);
        }
    }
}
