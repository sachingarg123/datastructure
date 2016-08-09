package searching;

import java.util.Arrays;

public class BinarySearch {

	int size;
	static Integer[] data;
	BinarySearch(int size){
		this.size = size;
		data = new Integer[size];
	}
	
	
	public int binarySearch(int item){
		int maxIndex = size()-1;
		int minIndex = 0;
		int searchIndex = (maxIndex+minIndex)/2;
		
		while(data[searchIndex]!=item && maxIndex>minIndex){
			if(data[searchIndex]>item){
				searchIndex = (minIndex+(searchIndex-1))/2;
			}else{
				searchIndex = (maxIndex+(searchIndex+1))/2;
			}
		}
		
		if(data[searchIndex]==item){
			return searchIndex;
		}
		return -1;
		
		
		
	}
	public void insert(int item){
		int i=0;
		if(data[i]==null){
			data[i] = item;
		}else{
		while(data[i]!=null &&i<data.length){
			if(data[i]>item){
				break;
			}
			i++;
		}
		shifItemToRight(i);
		data[i]=item;
		
		}
		
	}
	
	public void delete(int item){
		int i = binarySearch(item);
		if(i>-1){
			shifItemToLeft(i+1);
		}
	}
	
	public void shifItemToLeft(int i){
		for(int j=i;j<=size()-1;j++){
			data[j-1] = data[j];
		}
		data[size()-1] = null;
	}
	
	public void shifItemToRight(int i){
		for(int j=size()-1;j>=i;j--){
			data[j+1] = data[j];
		}
	}
	
	public int size(){
		int i=0;
		while(data[i]!=null && i<data.length){
			i++;
		}
		return i;
	}
	
	
	public static void main(String arg[]){
		BinarySearch binarySearch = new BinarySearch(10);
		binarySearch.insert(10);
		binarySearch.insert(5);
		binarySearch.insert(4);
		binarySearch.insert(11);
		binarySearch.insert(12);
		binarySearch.insert(9);
		System.out.println(Arrays.deepToString(data));
		System.out.println(binarySearch.binarySearch(9));
		System.out.println(binarySearch.binarySearch(12));
		System.out.println(binarySearch.binarySearch(10));
		binarySearch.delete(10);
		System.out.println(Arrays.deepToString(data));
		
		
	}

}
