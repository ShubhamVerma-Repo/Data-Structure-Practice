package Sorting_Algorithm;

public class InsertionSortExpample {

	public static void main(String[] args) {

		int []array= {6,3,1,5,2,4};
		for(int i=1;i<array.length;i++) {
			int value=array[i];
			int index=i;
			while(index>0 && array[index-1]>value) {
				array[index]=array[index-1];
				index--;
			}
			array[index]=value;
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
