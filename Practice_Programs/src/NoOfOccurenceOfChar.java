
public class NoOfOccurenceOfChar {
	
	public static void main(String[] args) {
		
		
		String s="Hellow World";
		int total_Count =s.length();
		int char_Count =s.replace("w", "").length();
		
		int count=total_Count-char_Count;
		
		System.out.println("NO of occurence of letter: "+count);
		
		
		
	}
	
	
	

}
