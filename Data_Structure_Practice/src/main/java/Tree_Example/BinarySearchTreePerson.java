package Tree_Example;

public class BinarySearchTreePerson {

	Node root;
	
	public BinarySearchTreePerson(){
		root = new Node();
		root = null;
	}
	
	public boolean insertNode(Person person){
		Node newNode = new Node();
		newNode.person = person;
		newNode.leftChild = null;
		newNode.rightChild = null;
		
		if(root == null){
			root = newNode;
			return true;
		}
		Node parent = root;
		Node child = root;
		
		while(child != null){
			parent = child;
			if(person.getName().compareTo(child.person.getName()) < 0 ){
				child = child.leftChild;
			}else{
				child = child.rightChild;
			}
		}
		if(person.getName().compareTo(parent.person.getName()) < 0){
			parent.leftChild = newNode;
		}else{
			parent.rightChild = newNode; 
		}
		return true;
	}
	
	public Node findNode(String name){
		Node nodeToFind = root;
		while(nodeToFind != null){
			if(name.compareTo(nodeToFind.person.getName()) == 0){
				break;
			}
			if(name.compareTo(nodeToFind.person.getName()) < 0){
				nodeToFind = nodeToFind.leftChild;
			}else{
				nodeToFind = nodeToFind.rightChild;
			}
		}
		return nodeToFind;
	}
	
	public Node findParent(String name){
		Node parent = root;
		Node child = root;
		
		while(child != null){
			
			if(name.compareTo(child.person.getName()) == 0){
				break;
			}
			parent = child;
			if(name.compareTo(child.person.getName()) < 0 ){
				child = child.leftChild;
			}else{
				child = child.rightChild;
			}
		}
		if(child != null){
			return parent;
		}else{
			return null;
		}
	}
	
	public Person getData(Node node){
		return node.person;
	}
	
	public void printBST(Node nodeSearchFrom){
		Node iteratedNode = nodeSearchFrom;
		if(iteratedNode != null){
			System.out.println(">>" + iteratedNode.person);
			printBST(iteratedNode.leftChild);
			printBST(iteratedNode.rightChild);
		}
	}
	
	class Node{
		private Person person;
		private Node leftChild;
		private Node rightChild;
	}
}
