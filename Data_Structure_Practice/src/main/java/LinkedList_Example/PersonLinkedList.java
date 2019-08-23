package LinkedList_Example;

import LinkedList_Example.IntLinkedList.Node;

public class PersonLinkedList {
	
	private Node head;
	
	public PersonLinkedList(){
		head = new Node();
		head.person = null;
		head.link = null;
	}
	
	public boolean insertItemAtFirst(Person item){
		Node newNode = new Node();
		newNode.person = item;
		newNode.link = head;
		head = newNode;
		return true;
	}
	
	public boolean insertItemAtLast(Person item){
		Node newNode = new Node();
		newNode.person = item;
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
	 * head.link.person ; this is because the first node which is made is temporary i.e., it is not considered in linkedlist
	 * except for the first insertion operation	
	 */
	public boolean deleteItemAtFirst(Person person){
		if((person.getName().equals(head.person.getName())) && (person.getAddress().equals(head.person.getAddress()))){
			head = head.link;
			return true;
		}else{
			Node firstNode = head;
			Node secondNode = head.link;
			while((secondNode != null) && ((!person.getName().equals(secondNode.person.getName())) && ((!person.getAddress().equals(secondNode.person.getAddress()))))){
				firstNode = secondNode;
				secondNode = secondNode.link;
			}
			if(secondNode != null){
				firstNode.link = secondNode.link;
				return true;
			}else{
				return false;
			}
		}
	}
	
	public boolean deleteItemAtLast(Person person){
		if((person.getName().equals(head.link.person.getName())) && (person.getAddress().equals(head.link.person.getAddress()))){
			head.link = head.link.link;
			return true;
		}else{
			Node firstNode = head.link;
			Node secondNode = head.link.link;
			while(true){
				if(secondNode ==null ||	(person.getName().equals(secondNode.person.getName()) && person.getAddress().equals(secondNode.person.getAddress()))){
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
	
	public void sortLinkedListAtFirst(){
		Node firstIterationNode = head.link;
		Person tempNode = null;
		while(firstIterationNode.link != null){
			Node secondIterationNode = head;
			int flag=0;
			while(secondIterationNode.link.person != null){
				if((secondIterationNode.person.getName().compareTo(secondIterationNode.link.person.getName()) > 0) /*&& (secondIterationNode.person.getAddress().compareTo(secondIterationNode.link.person.getAddress()) > 0)*/){
 					tempNode = secondIterationNode.person;
					secondIterationNode.person = secondIterationNode.link.person;
					secondIterationNode.link.person = tempNode;
				}
				secondIterationNode = secondIterationNode.link;
				flag=1;
			}
			firstIterationNode = firstIterationNode.link;
			if(flag==0)
				break;
		}
	}
	
	public void sortLinkedListAtLast(){
		Node firstIterationNode = head.link;
		Person tempNode = null;
		while(firstIterationNode.link != null){
			Node secondIterationNode = head.link;
			int flag=0;
			while(secondIterationNode.link.person != null){
				if((secondIterationNode.person.getName().compareTo(secondIterationNode.link.person.getName()) > 0) /*&& (secondIterationNode.person.getAddress().compareTo(secondIterationNode.link.person.getAddress()) > 0)*/){
 					tempNode = secondIterationNode.person;
					secondIterationNode.person = secondIterationNode.link.person;
					secondIterationNode.link.person = tempNode;
				}
				secondIterationNode = secondIterationNode.link;
				flag=1;
			}
			firstIterationNode = firstIterationNode.link;
			if(flag==0)
				break;
		}
	}
	
	public void printLinkedListAtFirst(){
		Node tempNode = head;
		while(tempNode != null){
			if(tempNode.link == null)
				break;
			System.out.println(tempNode.person);
			tempNode = tempNode.link;
		}
	}
	
	public void printLinkedListAtLast(){
		Node tempNode = head.link;
		while(tempNode != null){
			System.out.println(tempNode.person);
			tempNode = tempNode.link;
		}
	}
	
	class Node{
		private Person person;
		private Node link;
	}
}
