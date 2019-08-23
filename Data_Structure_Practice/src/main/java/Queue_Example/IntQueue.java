package Queue_Example;

public class IntQueue {

	private int[] Queue;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	public IntQueue(){
		size=3;
		total=0;
		front=0;
		rear=0;
		Queue =new int[size];
	}
	
	public IntQueue(int size){
		this.size=size;
		total=0;
		front=0;
		rear=0;
		Queue=new int[this.size];
	}

	/*
	 * rear and front is change its values in enqueue and dequeue because,
	 * if the pointer is pointing to the last index of Queue and 
	 * if we want to enqueue again a new value to queue than it must enqueue at the 
	 * initial index
	 */
	
	public boolean enqueue(int item){
		if(!isFull()){
			Queue[rear] = item;
			rear = (rear + 1) % size;
			total++;
			return true;
		}else{
			return false;
		}
	}
	
	public int dequeue(){
		if(!isEmpty()){
			int value = Queue[front];
			front = (front + 1) % size;
			total--;
			return value;
		}else{
			return -1;
		}
	}
	
	public boolean isFull(){
		return total==size;
	}
	
	public boolean isEmpty(){
		return total==0;
	}
	
	public void showAll(){
		int f=front;
		int t=total;
		while(t !=0 ){
				System.out.println(Queue[f]);
				f = (f + 1) % size;
				t--;
		}
	}
}
