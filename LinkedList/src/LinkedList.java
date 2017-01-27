
public class LinkedList<Type> {
	
	private Node<Type> head;
	
	/*
	 * To construct a LinkedList
	 * */
	public LinkedList(){
		head = null;
	}
	
	/*
	 * Checks whether List is Empty or not
	 * */
	
	public boolean isEmpty(){
		if (head == null){
			return true;
		}
		else 
			return false;
	}
	/*
	 * Insert  first element 
	 * */
	public void insertFirst(Type item){
		
		head= new Node<Type> (item, head);		
	}
	
	/* 
	 * Insert at last 
	 * */
	
	public void insertLast(Type item){
		
		if (head == null){			
			insertFirst(item);
		}
		else{
			Node<Type> temp = head;
			while (temp.next != null ){
				temp = temp.next;
			}
			temp.next = new Node<Type> (item,null);
			
		}
		
	}
	
	/* 
	 * 
	 * Insert after 
	 * */
	
	public void insertAfter(Type key, Type item){
		if (head == null){			
			insertFirst(item);
		}
		
		Node<Type> temp = head;
		
		while (temp.next != null ){
			if (temp.data.equals(key)){
				temp.next = new Node<Type> (item,temp.next);
				break;
			}
			temp= temp.next;
		}
		
	}
	
	/*
	 * Insert before
	 * */
	public void insertBefore(Type key, Type item){
		if (head == null){			
			insertFirst(item);
		}
		Node<Type> previous = null;
		Node<Type> current = head;
		while (current.next != null){
			previous = current;
			current = current.next;
			if (previous.data.equals(key)){
				previous.next = new Node<Type >(item, current);
				break;
			}
		}
	}
	
	
	
	
	/*
	 * Node Class (Inner class)
	 * 
	 * */
	private static class Node<Type>{
		
		private Type data;
		private Node<Type> next;
		
		public Node(Type data, Node<Type> next){
			this.data = data;
			this.next = next;
			
		}
		
	}
	
	

}
