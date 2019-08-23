package Queue_Example;

public class Main_Class {

	public static void main(String[] args) {
		
//------------------------------		INT QUEUE		----------------------------------------		

		System.out.println("\n\n\n------------------- Int queue -------------------\n");
		
		IntQueue intQueueObject=new IntQueue();
		
		System.out.println(intQueueObject.enqueue(2));
		System.out.println(intQueueObject.enqueue(44));
		System.out.println(intQueueObject.enqueue(63));
		System.out.println(intQueueObject.enqueue(98));
		
		intQueueObject.showAll();
		
		System.out.println(intQueueObject.dequeue());
		System.out.println(intQueueObject.dequeue());
		System.out.println(intQueueObject.dequeue());
		
		System.out.println(intQueueObject.enqueue(433));
		
		intQueueObject.showAll();
		
//------------------------------		PERSON QUEUE		----------------------------------------
		
		System.out.println("\n\n\n--------------------- Person queue -----------------\n");
		
		PersonQueue personQueueObject=new PersonQueue(3);
		
		System.out.println(personQueueObject.enqueue(new Person("shubham","gzb")));
		System.out.println(personQueueObject.enqueue(new Person("shivani","noida")));
		System.out.println(personQueueObject.enqueue(new Person("rahul","delhi")));
		System.out.println(personQueueObject.enqueue(new Person("vansh","gzb")));
		
		personQueueObject.showAll();
		
		System.out.println(personQueueObject.dequeue());
		System.out.println(personQueueObject.dequeue());
		System.out.println(personQueueObject.dequeue());
		System.out.println(personQueueObject.dequeue());
		
		System.out.println(personQueueObject.enqueue(new Person("priyanka","delhi")));
		
		personQueueObject.showAll();
	}

}
