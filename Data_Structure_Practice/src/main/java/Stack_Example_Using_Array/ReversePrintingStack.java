package Stack_Example_Using_Array;

import java.util.Stack;

public class ReversePrintingStack {

	public static void main(String[] args) {

		Stack<Integer> intStack=new Stack<Integer>();
		intStack.push(2);
		intStack.push(90);
		intStack.push(68);
		intStack.push(5);
		intStack.push(432);
		
		System.out.println("Printing Reverse Stack Using Recursion");
		PrintStackUsingRecursion(intStack);
		
		System.out.println("Printing Reverse stack using Another Stack");
		PrintStackUsingAnotherStack(intStack);
	}
	
	public static void PrintStackUsingRecursion(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;
		
		int x=stack.peek();
		stack.pop();
		PrintStackUsingRecursion(stack);
		
		System.out.println(x);
		
		stack.push(x);
	}
	
	public static void PrintStackUsingAnotherStack(Stack<Integer> stack){
		Stack<Integer> reverseStack=new Stack<Integer>();
		
		while(!stack.isEmpty()){
			reverseStack.push(stack.pop());
		}
		
		while(!reverseStack.isEmpty()){
			System.out.println(reverseStack.pop());
		}
	}
	

}
