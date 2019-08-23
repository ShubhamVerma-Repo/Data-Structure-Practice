package Sorting_Algorithm;

import java.util.Scanner;

public class BubbleSortExample {

	public static void main(String[] args) {

		/*int[] array = {3,5,2,9,1};*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		int []array = new int[size];
		
		System.out.println("enter the elements in array : ");
		int iterationLiteral = 0; 
		while(iterationLiteral < size){
			array[iterationLiteral] = scan.nextInt();
			iterationLiteral++;
		}
		
		int i=0;
		int j=0;
		int temp;
		
		int x=0;
		System.out.println("before sorting : ");
		while(x < array.length){
			System.out.print(array[x]);
			x++;
		}
		
		//bubble sorting
		for(i = 0; i< array.length; i++){
			int flag=0;
			for(j=0;j<array.length-1;j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		
		System.out.println("\n\nafter sorting : ");
		int k=0;		
		while(k < array.length){
			System.out.print(array[k]);
			k++;
		}
	}

}
