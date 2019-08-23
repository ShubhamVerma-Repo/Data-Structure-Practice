package Sorting_Algorithm;

public class SelectionSortExample {

	public static void main(String[] args) {
		
		int []array = {5,4,1,9,2,0};
		
		System.out.println("Before sorting : ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] +" ");
		}
		
		for(int i=0; i<array.length;i++){
			int min = i;
			for(int j=i+1; j<array.length;j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
		System.out.println("\n\nAfter sorting : ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] +" ");
		}
	}

}
