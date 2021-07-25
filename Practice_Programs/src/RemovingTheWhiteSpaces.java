
public class RemovingTheWhiteSpaces {
	
	public static void main(String[] args) {
		
		String s="java programmin    java    oops";
		System.out.println("Before Removing White Spaces: "+s);
		
		String s1= s.replaceAll("\\s", "");
		System.out.println("After Removing White Spaces: "+s1);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
