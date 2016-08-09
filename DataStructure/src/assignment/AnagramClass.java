package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramClass {


	public boolean checkAnagram(String array1,String array2){
		char[] a = array1.toCharArray();
		char[] b = array2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}
	
	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		String first = out.next();
		String second = out.next();
		AnagramClass anagram = new AnagramClass();
		System.out.println(anagram.checkAnagram(first, second));

	}

}
