package LinkedList_Example;

public class CircularIntSinglyLinkedList {

	Node cursor;
	
	public CircularIntSinglyLinkedList(){
		cursor = new Node();
		cursor.value = 0;
		cursor.next = null;
	}
	
	public boolean insertItem(int item){
		if(cursor.value == 0){
			cursor.value = item;
			cursor.next = cursor;
			System.out.println("first item " + cursor.value);
		}else{
			Node newNode = new Node();
			newNode.value = item;
			newNode.next = cursor.next;
			cursor.next = newNode;
			System.out.println("new item "+cursor.next.value);
		}
		return true;
	}
	
	public void printCircularLinkedList(){
		Node temp = cursor;
		while(cursor.next != cursor){
			System.out.println(cursor.next.value);
			if(cursor.next == temp)
				break;
			else
				cursor = cursor.next;
		}
	}
	
	class Node{
		private int value;
		private Node next;
	}
}
