package StudentManagementSystemPOC;

public class StudentLinkedList {
	
	private Node head;
	
	public StudentLinkedList(){
		head = new Node();
		head.student = null;
		head.next = null;
	}
	
	public String insertStudentDetails(Student student){
		Node newNode = new Node();
		newNode.student = student;
		newNode.next = head;
		head = newNode;
		return "Insertion of new student with rollno "+ student.getRollno() + " has been done !!";
	}
	
	public String rollnoExists(String rollno){
		boolean exists = false;
		Node checkExistenceNode = head;
		while(checkExistenceNode != null){
			if(rollno.equals(checkExistenceNode.student.getRollno())){
				exists = true;
			}
			checkExistenceNode = checkExistenceNode.next;
		}
		if(exists == true){
			return "student with rollno " + rollno + "is found  !!";
		}else{
			return "student with rollno " + rollno + "is not found  !!";
		}
	}
	
	public String deleteStudentDetails(String rollno){
		if(rollno.equals(head.student.getRollno())){
			head = head.next;
			return "\n\ndeletion of student with rollno "+ rollno +" has been done !!";
		}else{
			Node firstNode = head;
			Node secondNode =head.next;
			while(true){
				if(secondNode.next == null || rollno.equals(secondNode.student.getRollno())){
					break;
				}else{
					firstNode = secondNode;
					secondNode = secondNode.next;
				}
			}
			if(secondNode.next != null){
				firstNode.next = secondNode.next;
				return "\n\ndeletion of student with rollno "+ rollno +" has been done !!";
			}else{
				return "\n\ndeletion doesn't happend since rollno "+ rollno +" doesn't exists !!";
			}
		}
	}
	
	public Student fetchStudentDetails(String rollno){
		Node detailsFinderNode = head;
		while(detailsFinderNode.student != null){
			if(rollno.equals(detailsFinderNode.student.getRollno())){
				break;
			}
			detailsFinderNode = detailsFinderNode.next;
		}
		if(detailsFinderNode != null){
			return detailsFinderNode.student;
		}else{
			return null;
		}
	}
	
	public String updateStudentDetails(String rollno, String name, double cgpa){
		Node studentNodeToUpdate = head;
		while(studentNodeToUpdate != null){
			if(rollno.equals(studentNodeToUpdate.student.getRollno())){
				break;
			}
			studentNodeToUpdate = studentNodeToUpdate.next;
		}
		if(studentNodeToUpdate != null){
			studentNodeToUpdate.student.setName(name);
			studentNodeToUpdate.student.setCgpa(cgpa);
			return "\n\nstudent with rollno "+ rollno +" has been updated !!";
		}else{
			return "\n\nstudent with rollno " + rollno + "is not found  !!";
		}
	}
	
	public void sortStudentListUsingBubbleSort(){
		Node tempNode1 = head;
		Student newTempNode = null;
		while(tempNode1 != null){
			int flag = 0;
			Node tempNode2 = head;
			while(tempNode2.next.student != null){
				if(tempNode2.student.getRollno().compareTo(tempNode2.next.student.getRollno()) > 0 ){
					newTempNode = tempNode2.student;
					tempNode2.student = tempNode2.next.student;
					tempNode2.next.student = newTempNode;
					flag=1;
				}
				tempNode2 = tempNode2.next;
			}
			tempNode1 = tempNode1.next;
			if(flag == 0)
				break;
		}
	}
	
	public boolean sortStudentListUsingMergeSort(Node originalLinkedList){
		int lengthOfStudentList = countLengthOfStudentList();
		if(lengthOfStudentList < 2)
			return true;
		int mid = lengthOfStudentList / 2;
		Node leftSubLinkedList[] = new Node[mid];
		Node rightSubLinkedList[] = new Node[lengthOfStudentList - mid];
		
		
		
		
		return true;
	}
	
	public Student searchStudentUsingBinarySearch(String rollno){
		Node startNodeRollno = head;
		Node endNodeRollno = findLastNode();
		Node middleNodeRollno = null;
		while(startNodeRollno.student.getRollno().compareTo(endNodeRollno.student.getRollno()) == 0 || startNodeRollno.student.getRollno().compareTo(endNodeRollno.student.getRollno()) < 0){
			middleNodeRollno = findMiddleNode(startNodeRollno, endNodeRollno);
			if((middleNodeRollno.student.getRollno().compareTo(rollno)) == 0){
				break;
			}else if((middleNodeRollno.student.getRollno().compareTo(rollno)) > 0){
				endNodeRollno = middleNodeRollno;
			}else{
				startNodeRollno = middleNodeRollno.next;
			}
		}
		return middleNodeRollno.student;
	}
	
	public int countLengthOfStudentList(){
		Node tempNode = head;
		int count = 0;
		while(tempNode != null){
			count++;
			tempNode = tempNode.next;
		}
		return count;
	}
	
	public Node findLastNode(){
		Node tempNode = head;
		while(tempNode.next.student != null){
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	
	public Student nodeStudent(Node node){
		return node.student;
	}
	
	public Node startNode(){
		return head;
	}
	
	public int lastNodeIndex(){
		Node tempNode = head;
		int index = 0;
		while(tempNode != null){
			index++;
			tempNode = tempNode.next;
		}
		return index;
	}
	
	public Node findMiddleNode(Node startNode, Node endNode){
		if(startNode == null)
			return null;
		Node slowIterationNode = startNode;
		Node fastIterationNode = startNode.next;
		while(fastIterationNode != null){
			fastIterationNode = fastIterationNode.next;
			if(fastIterationNode != null){
				slowIterationNode = slowIterationNode.next;
				fastIterationNode = fastIterationNode.next;
			}
		}
		return slowIterationNode;
	}
	
//	public int middleNodeIndex(){
//		Student midNode = findMiddleNode();
//		Node tempNode = head;
//		int index = 0;
//		while(tempNode.student != midNode){
//			tempNode = tempNode.next;
//			index++;
//		}
//		return ++index;
//	}
	
	public void printAllStudentDetails(){
		Node lastNode = head;
		while(lastNode.next != null){
			System.out.println(lastNode.student);
			lastNode = lastNode.next;
		}
	}
	
	class Node{
		private Student student;
		private Node next;
	}

}
