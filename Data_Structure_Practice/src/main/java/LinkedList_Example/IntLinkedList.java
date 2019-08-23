package LinkedList_Example;

public class IntLinkedList {

	private Node head;
	
	public IntLinkedList(){
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	

	/*
	 * slight difference between insertion at first and insertion at last for all the operations such as
	 * insertion 
	 * sorting
	 * displaying 
	 * 
	 * these operations have a minute difference, this is because the order of insertion 
	 */
	
	public boolean insertItemAtFirst(int item){
		Node newNode = new Node();
		newNode.value = item;
		newNode.link = head;
		head = newNode;
		return true;
	}
	
	public boolean insertItemAtLast(int item){
		Node newNode = new Node();
		newNode.value = item;
		newNode.link = null;
		
		Node lastNode = new Node();
		lastNode = head;
		while(lastNode.link != null){
			lastNode = lastNode.link;
		}
		lastNode.link = newNode;
		return true;
	}
	
	/*
	 * head.link.value ; this is because the first node which is made is temporary i.e., it is not considered in linkedlist
	 * except for the first insertion operation	
	 */
	public boolean deleteItem(int item){
		if(head.link.value==item){
			head.link = head.link.link;
			return true;
		}else{
			Node firstNode = head;
			Node secondNode = head.link;
			while(true){
				if(secondNode == null || secondNode.value == item ){
					break;
				}else{
					firstNode = secondNode;
					secondNode = secondNode.link;
				}
			}
			if(secondNode != null){
				firstNode.link = secondNode.link;
				return true;
			}else{
				return false;
			}
		}
	}

	public void sortingLinkedListInsertedAtFirst(){
		Node firstIterationNode = head.link;
		int tempNode = 0;
		
		while(firstIterationNode.link != null){
			Node secondIterationNode = head;
			while(secondIterationNode.link != null){
				if(secondIterationNode.value < secondIterationNode.link.value){
 					tempNode = secondIterationNode.value;
					secondIterationNode.value = secondIterationNode.link.value;
					secondIterationNode.link.value = tempNode;
				}
				secondIterationNode = secondIterationNode.link;
			}
			firstIterationNode = firstIterationNode.link;
		}
	}
	
	public void sortingLinkedListInsertedAtLast(){
		Node firstIterationNode = head.link;
		int tempNode = 0;
		
		while(firstIterationNode.link != null){
			Node secondIterationNode = head.link;
			while(secondIterationNode.link != null){
				if(secondIterationNode.value < secondIterationNode.link.value){
 					tempNode = secondIterationNode.value;
					secondIterationNode.value = secondIterationNode.link.value;
					secondIterationNode.link.value = tempNode;
				}
				secondIterationNode = secondIterationNode.link;
			}
			firstIterationNode = firstIterationNode.link;
		}
	}
	
	public void printLinkedListInsertedAtFirst(){
		Node tempNode = head;
		while(tempNode!=null){
			if(tempNode.link==null)
				break;
			System.out.println(" value : "+tempNode.value);
			tempNode = tempNode.link;
		}
	}
	
	public void printLinkedListInsertedAtLast(){
		Node tempNode = head.link;
		while(tempNode!=null){
			System.out.println(" value : "+tempNode.value);
			tempNode = tempNode.link;
		}
	}
	
	class Node{
		private int value;
		private Node link;
	}
}
