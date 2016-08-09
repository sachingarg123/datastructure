package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChars {
	
	
	public boolean hasDuplicateChars(String s){
		Set hashSet = new HashSet();
		boolean isDuplicate=false;
		for(int i=0;i<s.length();i++){
			char j = s.charAt(i);
			if(!hashSet.add(j)){
				isDuplicate=true;
				break;
			}
		}
		return isDuplicate;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		String value = out.next();
		
		DuplicateChars duplicateChar = new DuplicateChars();
		System.out.println(duplicateChar.hasDuplicateChars(value));
		
	}

}
