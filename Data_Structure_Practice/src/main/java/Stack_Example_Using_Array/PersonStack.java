package Stack_Example_Using_Array;

public class PersonStack {

	private Person[] Stack;
	private int top;
	private int size;
	
	public PersonStack(){
		top=-1;
		size=10;
		Stack=new Person[size];
	}
	
	public PersonStack(int size){
		top=-1;
		this.size=size;
		Stack=new Person[this.size];
	}
	
	public boolean push(Person item){
		if(!isFull()){
			top++;
			Stack[top]=item;
			return true;
		}else{
			return false;
		}
	}
	
	public Person pop(){
		if(!isEmpty()){
			Person details=Stack[top];
			top--;
			return details;
		}else{
			return null;
		}
	}
	
	public Person peek(){
		if(!isEmpty()){
			return Stack[top];
		}else{
			return null;
		}
	}
	
	public boolean isFull(){
		return top==Stack.length-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public void showAll(){
		int t=top;
		while(t != -1){
			System.out.println(Stack[t]);
			t--;
		}
	}
}
