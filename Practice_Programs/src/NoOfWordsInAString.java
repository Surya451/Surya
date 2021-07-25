import java.util.Scanner;

public class NoOfWordsInAString {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the value of String: ");
		Scanner sc=new Scanner(System.in);
		String n= sc.nextLine();
		int count =1;
		
		
		for(int i=0 ;i<n.length()-1;i++) {
			if((n.charAt(i)==' ')&&(n.charAt(i+1)!=' ')) {
				count++;
			}
			
			
		}
		
		
		System.out.println("count= "+count);
	}
	
	
	
	
	

}
