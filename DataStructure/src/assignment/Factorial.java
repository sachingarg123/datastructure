package assignment;

public class Factorial {
	
	
	public void factorial(int num){
		
		int result = 1;
		
		for(int i=num;i>0;i--){
			result = result*num;
			num--;
		}
		System.out.println(result);
		
	}
	
	public int factorialrecursive(int num){
		
		if(num==0){
			return 1;
		}
	return num*factorialrecursive(num-1);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Factorial().factorial(6);
		System.out.println(new Factorial().factorialrecursive(6));

	}

}
