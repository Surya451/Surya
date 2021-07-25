
public class SwappingTwoNo {

	public static void main(String[] args) {
		int a=22,b=77;
		
		System.out.println("Before Swapping..."+a+" "+b);
		
		// Logic 1 using third variable
		/*int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping..."+a+" "+b);*/
		
		// Logic 2 using + & - operators
		
	   /*	a=a+b; // 22+77
		b=a-b; // 99-77
		a=a-b; // 99-22
		
		System.out.println("After Swapping..."+a+" "+b); */
		
		//Logic 3 using * & / operators
		//Here the values must no be equal to zero
		
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		 
		//using bitwise Xor operator
		
		/*a=a^b;
		b=a^b;
		a=a^b;*/
		
		//Logic through single line
		
		b=a+b-(a=b);
		
		
		
		System.out.println("After Swapping..."+a+" "+b);
		
	}
	
	
}
