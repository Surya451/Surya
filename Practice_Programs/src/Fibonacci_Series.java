import java.util.Scanner;

//Fibonacci Series upto n numbers



public class Fibonacci_Series {
	
	public static void main(String[] args) {
		
		int a=0,b=1;
	
		System.out.println("Enter the value of n: ");
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
			
		
		System.out.println("Fibonacci Series Upto " + n + ":");
		//While loop to calculate the fibonacci series upto n numbers
		while (a<=n) {
     		int sum=a+b;
			a=b;
			b=sum;
			System.out.println(a+ "");	
		}	
	}
}
