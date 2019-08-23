package Sorting_Algorithm;

public class MergeSortExample {

	public static void main(String[] args) {

		int array[] = {5,9,1,8,2,3,6};
		System.out.println("before sorting : ");
		int j=0;
		while(j < array.length){
			System.out.print(array[j] + " ");
			j++;
		}
		
		int finalSortedArray[] = mergeSort(array);
		System.out.println("\n\nafter sorting : ");
		int i = 0 ;
		while(i < finalSortedArray.length){
			System.out.print(finalSortedArray[i] + " ");
			i++;
		}
	}
	
	public static int[] mergeSort(int originalArray[]){
		int lengthOfArray = originalArray.length;
		if(lengthOfArray < 2 ){
			return originalArray;
		}
		int mid = lengthOfArray / 2;
		int leftSubArray[] = new int [mid];
		int rightSubArray[] = new int [lengthOfArray - mid];
		for(int i = 0 ; i < mid ; i++){
			leftSubArray[i] = originalArray[i];
		}
		for(int i = mid ;i < lengthOfArray ; i++){
			rightSubArray[i-mid] = originalArray[i];
		}
		mergeSort(leftSubArray);
		mergeSort(rightSubArray);
		int []sortedArray = merge(leftSubArray, rightSubArray, originalArray);
	
		return sortedArray;
	}
	
	public static int[] merge(int leftArray[], int rightArray[], int originalArray[]){
		int lengthOfLeftArray = leftArray.length;
		int lengthOfRightArray = rightArray.length;
		int i=0,j=0,k=0;
		
		while(i < lengthOfLeftArray && j < lengthOfRightArray){
			if(leftArray[i] <= rightArray[j]){
				originalArray[k] = leftArray[i];
				k++;
				i++;
			}else{
				originalArray[k] = rightArray[j];
				k++;
				j++;
			}
		}
		while(i < lengthOfLeftArray){
			originalArray[k] = leftArray[i];
			k++;
			i++;
		}
		while(j < lengthOfRightArray){
			originalArray[k] = rightArray[j];
			k++;
			j++;
		}
		
		return originalArray;
	}

}
