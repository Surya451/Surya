
public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="Surya";
		
	/*	StringBuffer sb=new StringBuffer(name);
		StringBuffer rev = sb.reverse();*/
		
		String rev="";
		/*
		 * int len =name.length();
		 * 
		 * 
		 * for(int i=len-1;i>=0;i--) {
		 * 
		 * rev=rev+name.charAt(i); }
		 */
		
		char a[]=name.toCharArray();
		int len =name.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+a[i];
		}
		
		
		
		
		
		System.out.println("Reverse "+rev);
				
		
		
		
		
		
	}
	
	
	
	

}
