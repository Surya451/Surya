import java.util.Scanner;

public class ReverseANo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num =sc.nextInt();
	   
		//using Algorithm
		/*int rev=0;
		
		while(num != 0) {
			
			rev=rev*10 + num%10;
			num=num/10;	
		}*/
		
		//Using StringBuffer Class
		
		/*StringBuffer sb =new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();*/
		
		//Using StringBuilder
		
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("The reverse no is: "+rev);
		
		
		
	}
	
	
	
	

}
