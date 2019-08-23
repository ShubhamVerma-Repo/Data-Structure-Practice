package LinkedList_Example;

public class PersonDoublyLinkedList {

	Node head;
	
	public PersonDoublyLinkedList(){
		head = new Node();
		head.person = null;
		head.next = null;
		head.prev = null;
	}
	
	public boolean insertPersonAtFirst(Person person){
		Node newNode = new Node();
		newNode.person = person;
		newNode.prev = head;
		newNode.next = head.next;
		head.next = newNode;
		return true;
	}
	
	public boolean insertPersonAtlast(Person person){
		Node newNode = new Node();
		newNode.person = person;
		newNode.next = null;
		
		if(head.next == null){
			newNode.prev = head;
			head.next = newNode;
		}else{
			Node lastNode = new Node();
			lastNode = head.next;
			while(lastNode.next != null){
				lastNode = lastNode.next;
			}
			newNode.prev = lastNode;
			lastNode.next = newNode;
		}
		
		return true;
	}
	
	public boolean deleteItem(Person person){
		if(person.getName().equals(head.next.person.getName()) && person.getAddress().equals(head.next.person.getAddress())){
			head.next = head.next.next;
			return true;
		}else{
			Node firstNode = new Node();
			Node secondNode = new Node();
			firstNode = head.next;
			secondNode = head.next.next;
			while(true){
				if(secondNode.next == null || (person.getName().equals(secondNode.person.getName()) && person.getAddress().equals(secondNode.person.getAddress()))){
					break;
				}else{
					firstNode = secondNode;
					secondNode = secondNode.next;
				}
			}
			if(secondNode.next != null){
				firstNode.next = secondNode.next;
				return true;
			}else{
				return false;
			}
		}
	}
	
	public void sortPersonDoublyLinkedList(){
		Person temp = null;
		Node firstNode = new Node();
		firstNode = head.next;
		while(firstNode != null){
			int flag=0;
			Node secondNode = new Node();
			secondNode = head.next;
			while(secondNode.next != null){
				if((secondNode.person.getName().compareTo(secondNode.next.person.getName()) > 0) /*&& ((secondNode.person.getAddress().compareTo(secondNode.next.person.getAddress())) > 0 )*/){
					temp = secondNode.person;
					secondNode.person = secondNode.next.person;
					secondNode.next.person = temp;
					flag=1;
				}
				secondNode = secondNode.next;
			}
			if(flag==0){
				break;
			}else{
				firstNode = firstNode.next;
			}
		}
	}
	
	public void printPersonDoublyLinkedList(){
		Node newNode = new Node();
		newNode = head.next;
		while(newNode != null){
			System.out.println(newNode.person);
			newNode = newNode.next;
		}
	}
	
	class Node{
		private Person person;
		private Node next;
		private Node prev;
	}
}
