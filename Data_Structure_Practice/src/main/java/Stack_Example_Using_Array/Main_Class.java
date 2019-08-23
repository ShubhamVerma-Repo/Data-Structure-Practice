package Stack_Example_Using_Array;

import java.util.Scanner;

public class Main_Class {
	public static void main(String[] args) {
		
//------------------------------		INT STACK		----------------------------------------
		
		IntStack intStackObject=new IntStack(3);
		
		System.out.println("-------------INT STACK--------------\n\n");
		
		System.out.println(intStackObject.push(2));
		System.out.println(intStackObject.push(4));
		System.out.println(intStackObject.push(6));
		System.out.println(intStackObject.push(7));		
		
		intStackObject.showAll();
		
		System.out.println(intStackObject.pop());
		System.out.println(intStackObject.pop());
		System.out.println(intStackObject.pop());
		System.out.println(intStackObject.pop());
		System.out.println(intStackObject.pop());
		
		intStackObject.showAll();
		
//------------------------------		PERSON STACK		----------------------------------------
		
		Scanner scan=new Scanner(System.in);

		System.out.println("\n\n\n-------------PERSON STACK--------------\n\n");
		
		/*System.out.println("enter the size of Person Stack");
		int sizeOfPersonStack=scan.nextInt();
		String name;
		String address;
		
		PersonStack personStackObject=new PersonStack(sizeOfPersonStack);
		
		System.out.println("enter the name and address of person");
		for(int i=0;i<sizeOfPersonStack;i++){
			name=scan.nextLine();
			address=scan.nextLine();
			scan.next();
			System.out.println(personStackObject.push(new Person(name,address)));
		}

		//top most element 
		System.out.println("peek element : "+personStackObject.peek());
		
		System.out.println(personStackObject.pop());
		System.out.println(personStackObject.pop());
		System.out.println(personStackObject.pop());
		System.out.println(personStackObject.pop());*/
		
		
		PersonStack personStackObject1=new PersonStack();
		
		System.out.println(personStackObject1.push(new Person("shubham","gzb")));
		System.out.println(personStackObject1.push(new Person("rahul","delhi")));
		System.out.println(personStackObject1.push(new Person("vidhi","noida")));
		System.out.println(personStackObject1.push(new Person("vansh","gzb")));
		
		personStackObject1.showAll();
		
		System.out.println(personStackObject1.pop());
		System.out.println(personStackObject1.pop());
		System.out.println(personStackObject1.pop());
		System.out.println(personStackObject1.pop());
		
		personStackObject1.showAll();
		scan.close();
	}

}
