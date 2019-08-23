package StudentManagementSystemPOC;

import StudentManagementSystemPOC.StudentLinkedList.Node;

public class Main_Class {

	public static void main(String[] args) {

		StudentLinkedList studentLinkedListObject = new StudentLinkedList();
		
		//INSERTION
		
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("shubham", "44", 8.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("ankur", "46", 4.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("setu", "47", 7.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("priyanka", "48", 3.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("anjali", "49", 6.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("shivam", "45", 5.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("rahul", "07", 5.9)));
		System.out.println(studentLinkedListObject.insertStudentDetails(new Student("manik", "12", 78.9)));
		
		System.out.println("\n\nstudent list : ");
		studentLinkedListObject.printAllStudentDetails();
		
		//DELETION
		
		System.out.println(studentLinkedListObject.deleteStudentDetails("47"));
		System.out.println(studentLinkedListObject.deleteStudentDetails("4w"));
		
		System.out.println("\n\nstudent list after deletion : ");
		studentLinkedListObject.printAllStudentDetails();
		
		//SELECTION
		
		String rollno = "3";
		Student studentDetails = studentLinkedListObject.fetchStudentDetails(rollno);
		System.out.println("\n\ndetails of student whose rollno is : " + rollno );
		if(studentDetails != null){
			System.out.println(studentDetails.getRollno());
			System.out.println(studentDetails);
		}else{
			System.out.println("student not found  !!!");
		}
		
		//UPDATION
		
		System.out.println(studentLinkedListObject.updateStudentDetails("49", "parul", 8.8));
		
		System.out.println("\n\nstudent list after updation : ");
		studentLinkedListObject.printAllStudentDetails();
		
		//SORTING
		
		studentLinkedListObject.sortStudentListUsingBubbleSort();
		System.out.println("\n\nstudent list after sorting : ");
		studentLinkedListObject.printAllStudentDetails();
		
		//SEARCHING USING BINARY SEARCH
		
		String searchRollno = "49";
		System.out.println("\n\nHere we are searching node for rollno "+ searchRollno +" using Binary Search :");
		Student searchNode = studentLinkedListObject.searchStudentUsingBinarySearch(searchRollno);
		System.out.println("\nnode for the " + searchRollno + " is : " + searchNode);
		
		//LENGTH 
		
		int length = studentLinkedListObject.countLengthOfStudentList();
		System.out.println("\n\nlength of student list : " + length);

		//LAST NODE

		Student lastNode = studentLinkedListObject.nodeStudent(studentLinkedListObject.findLastNode());
		System.out.println("\n\nlast node of student linked list is : " + lastNode);
		
		//MIDDLE NODE 
		
		Node middleNode = studentLinkedListObject.findMiddleNode(studentLinkedListObject.startNode(), studentLinkedListObject.findLastNode());
		System.out.println("\n\nmiddle node of student list : " + studentLinkedListObject.nodeStudent(middleNode));
		
//		int midNodeIndex = studentLinkedListObject.middleNodeIndex();
//		System.out.println("index of midNode of student list : " + midNodeIndex);
		
		
	}

}
