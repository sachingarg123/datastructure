package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	public void sort(int[] data){
		
		for(int i=0;i<data.length-1;i++){
			for(int j=0;j<data.length-1-i;j++){
				if(data[j]>data[j+1]){
					int temp  = data[j+1];
					data[j+1]=data[j];
					data[j]=temp;
				}
			}
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = {12,7,8,14,5};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
