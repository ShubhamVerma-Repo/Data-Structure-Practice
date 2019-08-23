package Stack_Example_Using_Array;

public class IntStack {
	private int[] Stack;
	private int size;
	private int top;
	
	public IntStack(){
		top=-1;
		size=10;
		Stack=new int[size];
	}
	
	public IntStack(int size){
		top=-1;
		this.size=size;
		this.Stack=new int[size];
	}
	
	public boolean push(int item){
		if(!isFull()){
			top++;
			Stack[top]=item;
			return true;	
		}else{
			return false;
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			int value=Stack[top];
			top--;
			return value;
			//return Stack[top--];
		}else{
			return -1;
		}
	}
	
	public boolean isFull(){
		return (top == Stack.length-1);
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
