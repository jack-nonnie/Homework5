package simulator;

public class MyQueue<E> {
    //Node class for single linked list queue
    public static class Node<E> {
        //Instance variables for Node
        public E data;
        public Node next;

        //Constructor for Node, to be completed by you
        public Node(E a) {
        	this.data = a;
        	this.next =null;
        }

        //Constructor for Node, to be completed by you
        public Node(E dataItem, Node<E> nodeRef) {
        	this.data = dataItem;
        	this.next = nodeRef;
        }
    }

    //Instance variables for queue
    private Node<E> front;
    private Node<E> rear;
    private int size;

    //Constructor for queue, to be completed by you
    public MyQueue () {
    	
    	this.front = null;
    	this.rear = null;
    	this.size = 0;
    }

    //Adds a node to queue, to be completed by you
    public void offer(E item) { 
    	Node<E> node = new Node<E>(item);
    	if(this.size == 0) {
    		this.front = new Node(item);
    		
    		size++;
    	}
    	else {
    		Node cur = front;
    		while(cur.next != null) {
    			
    			cur = cur.next;
    		}
    		cur.next = node;
    		size++;
    	}
    }

    //Returns the node at front of queue, to be completed by you
    public E peek() { 
    	return front.data;
    }

    //Returns and removes the node at front of queue, to be completed by you
    public E poll() {
    	if (size != 0) {
        	Node <E> temp = front;
        	front = front.next;
        	size--;
        	return temp.data;
    	} else {
    		return null;
    	}
    	
    }

    //Returns the data element at a specific index, to be completed by you
    public E get(int index) {
    	Node <E> cur = front;
    	for(int i = 0; i < index; i++) {
    		cur = cur.next;
    	}
    	return cur.data;
    }

    //Returns the size of the queue, to be completed by you
    public int size() {	
    	return size;
    }
}
