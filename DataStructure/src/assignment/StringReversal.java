package assignment;

public class StringReversal {
	
	
	public static String reverse(String str){
		StringBuilder stringBuffer = new StringBuilder();
		return stringBuffer.append(str).reverse().toString();
	}
	
	public static String reverseIterative(String str){
		
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		return s;
	}
	
	public static String reverserecursivly(String str){
		
		if(str.length()<2){
			return str;
		}
		return reverserecursivly(str.substring(1))+str.charAt(0);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReversal reversal = new StringReversal();
		System.out.println(reversal.reverse("sachin"));
		System.out.println(reversal.reverseIterative("sachin"));
		
		System.out.println(reversal.reverserecursivly("sachin"));
		
		
		
	}

}
