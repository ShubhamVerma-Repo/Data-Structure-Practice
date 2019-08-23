package Tree_Example;

public class Main_Class {

	public static void main(String[] args) {

		BinarySearchTreePerson binarySearchTreePersonObject = new BinarySearchTreePerson();
		
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("shubham", "gzb")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("anjali", "delhi")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("priyanka", "delhi")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("vidhi", "noida")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("sakshi", "delhi")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("vansh", "gzb")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("ashutosh", "noida")));
		System.out.println(binarySearchTreePersonObject.insertNode(new Person("shivam", "noida")));
		
		binarySearchTreePersonObject.printBST(binarySearchTreePersonObject.findNode("shubham"));
		
		//System.out.println(binarySearchTreePersonObject.getData(binarySearchTreePersonObject.findNode("shubham")));
		
		String name = "aaa";
		if(binarySearchTreePersonObject.findParent(name) != null){
			System.out.println(binarySearchTreePersonObject.getData(binarySearchTreePersonObject.findParent(name)));
		}else{
			System.out.println("Node not found in tree !!!");
		}
	}

}
