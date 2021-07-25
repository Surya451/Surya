import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str =sc.next();
		
		String org=str;
		
		String rev="";
		int len =str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev =rev+str.charAt(i);
		}
		System.out.println("Reverse of the String: "+rev);
		
		if(org.equals(rev)) {
			System.out.println("The String is palindrome");
			
		}
		else {
			System.out.println("The String is not Palindrome");
		}
		
		
		
		
	}
	
	

}
