package assignment;

import java.util.Scanner;

public class Palindrome {
	
	public boolean checkPalindrome(int number){
		
		if(number == reverse(number)){
			return true;
		}
		return false;
		
	}
	
	public int reverse(int number){
		int reverse = 0;
		
		while(number!=0){
			reverse = reverse*10+ number%10;
			number = number/10;
			
		}
		return reverse;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(new Palindrome().checkPalindrome(number));
		

	}

}
