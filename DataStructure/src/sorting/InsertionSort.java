package sorting;

import java.util.Arrays;

public class InsertionSort {

	
	public void sort(int []data){
		int current;
		for(int i=0;i<data.length;i++){
			current = data[i];
			int j=i-1;
			while(j>=0 && data[j]>=current){
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = current;
			
		}
		
	}
	public static void main(String[] args) {
		
		int data[] = {10,5,7,9,1,18};
		
		new InsertionSort().sort(data);
		System.out.println(Arrays.toString(data));

	}

}
