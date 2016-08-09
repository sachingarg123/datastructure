package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	
	public void sort(int[] data){
		int minIndex;
		for(int i=0;i<data.length-1;i++){
			minIndex=i;
			for(int j=i+1;j<data.length;j++){
				if(data[j]<data[minIndex]){
					minIndex = j;
				}
			}
			
			int temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int arr[] = {8,5,3,9,2,0};
		new SelectionSort().sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
