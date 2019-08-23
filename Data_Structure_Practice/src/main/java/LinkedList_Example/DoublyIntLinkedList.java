package LinkedList_Example;

public class DoublyIntLinkedList {

	private Node head;
	
	public DoublyIntLinkedList(){
		head = new Node();
		head.value = 0;
		head.prev = null;
		head.next = null;
	}
	
	public boolean insertItemAtFirst(int item){
		Node newNode = new Node();
		newNode.value = item;
		newNode.next = head.next;
		newNode.prev = head;
		head.next = newNode;
		return true;
	}
	
	public boolean insertItemAtLast(int item){
		/*Node newNode = new Node();
		if(head.next == null){
			newNode.value = item;
			newNode.next = null;
			newNode.prev = head;
			head.next = newNode;
		}else{
			Node firstNode = new Node();
			Node secondNode = new Node();
			firstNode = head;
			secondNode = head.next;
			while(true){
				if(secondNode.next == null){
					newNode.value = item;
					newNode.next = null;
					newNode.prev = secondNode;
					secondNode.next = newNode;
					break;
				}else{
					firstNode = secondNode;
					secondNode = secondNode.next;
				}
			}
		}
		return true;*/
		
		Node newNode = new Node();
		newNode.value = item;
		newNode.next = null;
		
		Node lastNode = new Node();
		lastNode = head;
		while(lastNode.next != null){
			lastNode = lastNode.next;
		}
		newNode.prev = lastNode;
		lastNode.next = newNode;
		return true;
	}
	
	public boolean deleteItem(int item){
		if(head.next.value == item){
			head.next = head.next.next;
			return true;
		}else{
			Node firstNode = head.next;
			Node secondNode = head.next.next;
			while(true){
				if(secondNode == null || secondNode.value == item){
					break;
				}else{
					firstNode = secondNode;
					secondNode = secondNode.next;
				}
			}
			if(secondNode != null){
				firstNode.next = secondNode.next;
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public void sortDoublyLinkedList(){
		int temp;
		Node firstNode = new Node();
		firstNode = head.next;
		while(firstNode != null){
			int flag=0;
			Node secondNode = new Node();
			secondNode = head.next;
			while(secondNode.next != null){
				if(secondNode.value > secondNode.next.value){
					temp = secondNode.value;
					secondNode.value = secondNode.next.value;
					secondNode.next.value = temp;
					flag=1;
				}
				secondNode = secondNode.next;
			}
			if(flag ==0 ){
				break;
			}else{
				firstNode = firstNode.next;
			}
		}
	}
	
	public void printDoublyLinkedList(){
		Node newNode = new Node();
		newNode = head.next;
		while(newNode != null){
			System.out.println(newNode.value);
			newNode = newNode.next;
		}
	}

	
	class Node{
		private Node prev;
		private int value;
		private Node next;
	}
}
