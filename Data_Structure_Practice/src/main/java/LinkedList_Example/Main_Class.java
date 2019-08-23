package LinkedList_Example;

public class Main_Class {

	public static void main(String[] args) {

		
//*********************************			INT TYPE SINGLY LINKED LIST		*******************************		
		
//		IntLinkedList intLinkedListObject = new IntLinkedList();
		
//Insertion of a NEW NODE at FIRST place and move the further NODES
		
		/*intLinkedListObject.insertItemAtFirst(33);
		intLinkedListObject.insertItemAtFirst(65);
		intLinkedListObject.insertItemAtFirst(7);
		intLinkedListObject.insertItemAtFirst(3);
		intLinkedListObject.insertItemAtFirst(8);
		intLinkedListObject.insertItemAtFirst(1);
		System.out.println("----------LinkedList Display when Inserted At First \n \t\t So therefore Showing result in reverse order----------- ");
		intLinkedListObject.printLinkedListInsertedAtFirst();

		System.out.println("----------After Sorting ----------- ");
		intLinkedListObject.sortingLinkedListInsertedAtFirst();
		intLinkedListObject.printLinkedListInsertedAtFirst();
		
		System.out.println("----------After Deletion Of Nodes----------- ");
		System.out.println(intLinkedListObject.deleteItem(222));
		System.out.println(intLinkedListObject.deleteItem(7));
		intLinkedListObject.printLinkedListInsertedAtFirst();*/

		
//Insertion of a NEW NODE at LAST place
		
		/*System.out.println("----------LinkedList Display when Inserted At Last----------- ");
		intLinkedListObject.insertItemAtLast(99);
		intLinkedListObject.insertItemAtLast(12);
		intLinkedListObject.insertItemAtLast(78);
		intLinkedListObject.printLinkedListInsertedAtLast();
		
		System.out.println("----------After Sorting ----------- ");
		intLinkedListObject.sortingLinkedListInsertedAtLast();
		intLinkedListObject.printLinkedListInsertedAtLast();
		
		System.out.println("----------After Deletion Of Nodes----------- ");
		System.out.println(intLinkedListObject.deleteItem(12));
		System.out.println(intLinkedListObject.deleteItem(78));
		intLinkedListObject.printLinkedListInsertedAtLast();*/
		
		
		
//*********************************		PERSON TYPE SINGLY LINKED LIST		*******************************
		
		
		PersonLinkedList personLinkedListObject = new PersonLinkedList();
		
//Insertion of NEW NODE at FIRST place
		
		System.out.println(personLinkedListObject.insertItemAtFirst(new Person("saumya", "delhi")));
		System.out.println(personLinkedListObject.insertItemAtFirst(new Person("rahul", "delhi")));
		System.out.println(personLinkedListObject.insertItemAtFirst(new Person("shubham", "ghaziabad")));
		System.out.println(personLinkedListObject.insertItemAtFirst(new Person("chirag", "noida")));
		
		System.out.println("before sorting \n");
		personLinkedListObject.printLinkedListAtFirst();
		
		System.out.println(personLinkedListObject.deleteItemAtFirst(new Person("chirag", "noida")));
		
//		personLinkedListObject.sortLinkedListAtFirst();
		System.out.println("\n\n\n after sorting \n");
		personLinkedListObject.printLinkedListAtFirst();
		
		
//Insertion of NEW NODE at LAST place
		
		/*System.out.println(personLinkedListObject.insertItemAtLast(new Person("saumya", "delhi")));
		System.out.println(personLinkedListObject.insertItemAtLast(new Person("rahul", "delhi")));
		System.out.println(personLinkedListObject.insertItemAtLast(new Person("shubham", "ghaziabad")));
		System.out.println(personLinkedListObject.insertItemAtLast(new Person("chirag", "noida")));
		personLinkedListObject.printLinkedListAtLast();
		
		//System.out.println(personLinkedListObject.deleteItemAtLast(new Person("chirag", "noida")));
		
		System.out.println("before sorting \n");
		personLinkedListObject.printLinkedListAtLast();
		
		personLinkedListObject.sortLinkedListAtLast();
		System.out.println("\n\n\n after sorting \n");
		personLinkedListObject.printLinkedListAtLast();*/
		
		
		
//*********************************			INT TYPE DOUBLY LINKED LIST		*******************************		
		
		/*DoublyIntLinkedList doublyIntLinkedListObject = new DoublyIntLinkedList();
		
		System.out.println(doublyIntLinkedListObject.insertItemAtFirst(1));
		System.out.println(doublyIntLinkedListObject.insertItemAtFirst(77));
		System.out.println(doublyIntLinkedListObject.insertItemAtFirst(4));
		System.out.println(doublyIntLinkedListObject.insertItemAtFirst(2));
		System.out.println(doublyIntLinkedListObject.insertItemAtFirst(80));
		System.out.println(doublyIntLinkedListObject.insertItemAtFirst(0));
		
		System.out.println("\n\ndoubly linked list : \n");
		doublyIntLinkedListObject.printDoublyLinkedList();*/
		
//		doublyIntLinkedListObject.deleteItem(1);
//		doublyIntLinkedListObject.deleteItem(4);
//		System.out.println("\n\ndoubly linked list after delete : \n");
//		doublyIntLinkedListObject.printDoublyLinkedList();
		
		/*doublyIntLinkedListObject.sortDoublyLinkedList();
		System.out.println("\n\ndoubly linked list after sorting : \n");
		doublyIntLinkedListObject.printDoublyLinkedList();*/
		
		/*
		System.out.println(doublyIntLinkedListObject.insertItemAtLast(1));
		System.out.println(doublyIntLinkedListObject.insertItemAtLast(77));
		System.out.println(doublyIntLinkedListObject.insertItemAtLast(4));
		System.out.println(doublyIntLinkedListObject.insertItemAtLast(3));
		System.out.println(doublyIntLinkedListObject.insertItemAtLast(99));
		
		System.out.println("\n\ndoubly linked list before sorting : \n");
		doublyIntLinkedListObject.printDoublyLinkedList();
		
//		doublyIntLinkedListObject.deleteItem(1);
//		doublyIntLinkedListObject.deleteItem(77);
//		System.out.println("\n\ndoubly linked list after delete : \n");
//		doublyIntLinkedListObject.printDoublyLinkedList();
		
		doublyIntLinkedListObject.sortDoublyLinkedList();
		System.out.println("\n\ndoubly linked list after sorting : \n");
		doublyIntLinkedListObject.printDoublyLinkedList();*/
		
		
		
		
//*********************************		PERSON TYPE DOUBLY LINKED LIST		*******************************
		
//		PersonDoublyLinkedList personDoublyLinkedListObject = new PersonDoublyLinkedList();
		
		/*System.out.println(personDoublyLinkedListObject.insertPersonAtFirst(new Person("shubham","gzb")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtFirst(new Person("rahul","delhi")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtFirst(new Person("chirag","noida")));
		
		System.out.println("\n\nperson doubly linked list : \n");
		personDoublyLinkedListObject.printPersonDoublyLinkedList();
		
		System.out.println(personDoublyLinkedListObject.deleteItem(new Person("cshusbham","ngzb")));
		System.out.println(personDoublyLinkedListObject.deleteItem(new Person("rahul","delhi")));
		System.out.println("\n\nperson doubly linked list after delete : \n");
		personDoublyLinkedListObject.printPersonDoublyLinkedList();*/

		
		/*System.out.println(personDoublyLinkedListObject.insertPersonAtlast(new Person("shubham","gzb")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtlast(new Person("chirag","delhi")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtlast(new Person("rahul","noida")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtlast(new Person("akansha","gzb")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtlast(new Person("vidhi","delhi")));
		System.out.println(personDoublyLinkedListObject.insertPersonAtlast(new Person("manik","noida")));
		
		System.out.println("\n\nperson doubly linked list before sorting : \n");
		personDoublyLinkedListObject.printPersonDoublyLinkedList();
		
		personDoublyLinkedListObject.sortPersonDoublyLinkedList();
		System.out.println("\n\nperson doubly linked list after sorting : \n");
		personDoublyLinkedListObject.printPersonDoublyLinkedList();*/
		
		/*System.out.println(personDoublyLinkedListObject.deleteItem(new Person("chirag","noida")));
		//System.out.println(personDoublyLinkedListObject.deleteItem(new Person("rahul","delhi")));
		System.out.println("\n\nperson doubly linked list after delete : \n");
		personDoublyLinkedListObject.printPersonDoublyLinkedList();*/
		
		
		
//*********************************			CIRCULAR SINGLY LINKED LIST		*******************************		
		
		/*CircularIntSinglyLinkedList circularIntSingleLinkedListObject = new CircularIntSinglyLinkedList();
		
		circularIntSingleLinkedListObject.insertItem(6);
		circularIntSingleLinkedListObject.insertItem(4);
		circularIntSingleLinkedListObject.insertItem(7);
		circularIntSingleLinkedListObject.insertItem(2);

		System.out.println("\n\ncircular linked list : ");
		circularIntSingleLinkedListObject.printCircularLinkedList();*/
		
	}

}